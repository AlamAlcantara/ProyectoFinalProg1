
package proyectofinal2;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Conexion {
    
    //Private
    private Connection con;
   
    
    /* EL SIGUIENTE METODO ES PARA ESTABLECER LA CONEXION ENTRE LA APLICACION Y LA BASE DED DATOS*/
            
    public void conectar()/*throws ClassNotFoundException, SQLException*/{
        //Boolean bien=true;
        
         String url="jdbc:sqlserver://localhost:1433;databaseName=teatro;user=sa;password=123";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection(url);
                       
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"ERROR CON LA BASE DE DATOS");
          // bien=true;
        } catch (SQLException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"ERROR CON LA CONEXION A LA BASE DE DATOS");
            //bien=false;
        }
        //return bien;
    }
    
    
   /*EL SIGUIENTE METODO ES PARA COMPROBAR QUE LOS DATOS INTRODUCIDOS EN EL LOGION COINCIDAN
    CON ALGUN REGISTRO DE LA TABLA USUARIO CON PERFIL DE ADMINISTRADOR*/ 
    public Boolean validadmin(String usuario, String contraseña){
        Boolean bien=false;
        
        String query="SELECT*FROM usuario WHERE usuario=? AND contraseña=? AND perfil='ADMINISTRADOR'";
        
        try {
            this.conectar();
            PreparedStatement orden= con.prepareStatement(query);
            orden.setString(1, usuario);
            orden.setString(2,contraseña);
            
            ResultSet result=orden.executeQuery();
            
            if(result.next()){//SI EL USUARIO ADMINISTRADOR Y LA CONTRASEÑA COINCIDEN, SE CREA UNA VENTANA NUEVA DE TIPO VADMIN
                JOptionPane.showMessageDialog(null, "BIENVENDIO");
                Vadmin vadmin= new Vadmin();
                vadmin.setVisible(true);
                bien=true;
            }else{
                JOptionPane.showMessageDialog(null,"USUARIO O CONTRASEÑA INCORRECTOS");
            }
            
            
        } catch (SQLException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR AL INTENTAR INICIAR SESION");
            bien=false;
        } /*catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        return bien;
    }
    

   /*EL SIGUIENTE METODO ES PARA INTRODUCIR UN USUARIO NUEVO EN LA TABLA USUARIO DE LA BASE DE DATOS*/ 
    public void crearusuario(String nombre, String apellido, String usuario, String contraseña, String perfil){
     
        String query="execute insertarusuario '?','?','?','?','?'";
        String sql="{call insertarusuario ('?','?','?','?','?')}";
        String igual="SELECT*FROM usuario WHERE usuario=?";
        Boolean bien=false;    
        
        
        /*EL SIGUIENTE BLOQUE SE ENCARGA DE VERIFICAR QUE EL USUARIO NUEVO NO EXISTA*/
        try { 
        
        this.conectar();
        PreparedStatement usu_igual= con.prepareStatement(igual);
        
        usu_igual.setString(1,usuario);
        ResultSet confirmacion= usu_igual.executeQuery();
        
        if(confirmacion.next()){
            JOptionPane.showMessageDialog(null,"USUARIO YA EXISTENTE");
        }else{
            bien=true;
        }
        
        
        /*SI EL USUARIO NUEVO NO EXISTE, ENTONCES SE PROCEDE A INSERTARLO EN LA BASE DE DATOS*/
           if(bien==true){ 
           this.conectar();
           //EL INSERT SE HACE MEDIANTE IN PROCEDIMIENTO ALMACENADO CREADO EN LA BASE DE DATOS
           //CON EL NOMBRE DE INSERTARUSUARIO
           CallableStatement orden = con.prepareCall("{call insertarusuario (?,?,?,?,?)}");
       
            orden.setString(1,usuario);
            orden.setString(2,contraseña);
            orden.setString(3,nombre);
            orden.setString(4,apellido);
            orden.setString(5,perfil);
            
            orden.executeUpdate();
            JOptionPane.showMessageDialog(null,"USUARIO CREADO EXITOSAMENTE");
            
            orden.close();
            con.close();
           }
           // }catch (ClassNotFoundException ex) {
           // Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
          // JOptionPane.showMessageDialog(null,"ERROR CON LA CONEXION A LA BASE DE DATOS");
        } catch (SQLException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"ERROR CON AL INTENTAR INSERTAR USUARIO NUEVO");
        }    
    }
    
    
    
    /*EL SIGUIENTE METODO ES PARA PRECISAMENTE HACER UNA CONSULTA QUE SE PROYECTE EN UNA TABLA
    ESTE METODO RECIBE UNA CONSULTA QUE ES LA QUE SE USARÁ EN SQL SERVER
    */
    public ResultSet consultatabla(String consulta){
        PreparedStatement orden= null;
         ResultSet resultado;
        
        
        try {
            this.conectar();
            orden = con.prepareStatement(consulta);
            resultado= orden.executeQuery();
            return resultado;            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }  
    }
    
    
    /*EL SIGUIENTE METODO ES PARA ELIMINAR UN USUARIO
    UTILIZANDO EL NOMBRE DEL USUARIO Y SU CONTRASEÑA*/
    public void eliminarusu(String usuario, String contraseña){
        this.conectar();
        
        String sql="DELETE FROM usuario WHERE usuario=? AND contraseña=?";
        
        try {
            PreparedStatement orden= con.prepareStatement(sql);
            orden.setString(1,usuario);
            orden.setString(2,contraseña);
            
            
            orden.executeUpdate();
            JOptionPane.showMessageDialog(null,"USUARIO ELIMINADO EXITOSAMENTE");
            
           
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"ERROR AL ELIMINAR EL USUARIO");
        }
        
    }
    
   
   /*EL SIGUIENTE METODO RECIBE POR PARAMETRO UN USUARIO
    Y VERIFICA POR MEDIO DE UN SELECT SI EL USUARIO INTRODUCIDO
    EXISTE EN LA BASE DE DATOS*/ 
    public Boolean validusuario(String usuario){
        
        Boolean bien=false;
        this.conectar();
        String sql="SELECT*FROM usuario WHERE usuario=?";
        
        try {
            PreparedStatement orden= con.prepareStatement(sql);
            orden.setString(1, usuario);
            
            ResultSet rs= orden.executeQuery();
            
            if(rs.next()){
                bien=true;
            }else{
                JOptionPane.showMessageDialog(null, "USUARIO NO EXISTE");
            }
            
            
        } catch (SQLException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE DATOS");
        }
        
        
        return bien;
    }

    
   /*ESTE METODO OBTIENE TODA LA INFORMACION DE UN USUARIO Y LA ALMACENA EN UN ARRAYLIST*/ 
   public ArrayList getinfo(String usuario){
       
    Boolean bien=false;   
    ArrayList<String> info= new ArrayList<String>();   
    this.conectar();
        
    String sql="SELECT*FROM usuario WHERE usuario=?";    
    
        try {
            PreparedStatement orden= con.prepareStatement("SELECT * FROM usuario WHERE usuario=?");
            orden.setString(1,usuario);
            
            ResultSet result= orden.executeQuery();
            

            while(result.next()){
            String contraseña= (String)result.getString(3);
            String nombre= (String)result.getString(4);
            String apellido=(String)result.getString(5);
            String perfil=(String)result.getString(6);
            
            info.add(contraseña);
            info.add(nombre);
            info.add(apellido);
            }
   
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR CON LA BASE DE DATOS");
        }    
       return info;
   }
   
   
   
   
   /*EL SIGUIENTE METODO RECIBE POR PARAMETROS LOS NUEVOS DATOS QUE SE CAMBIARÀN EN UN USUARIO
   YA EISTENTE EN LA BASE DE DATOS*/
   public Boolean modinfo(String contraseña, String nombre, String apellido,String perfil,String usuario){
       
       Boolean bien=false;
       this.conectar();
       
       String sql="UPDATE usuario SET contraseña=? , nombre=? , apellido=? , perfil=? WHERE usuario=?";
       
        try {
            PreparedStatement orden= con.prepareStatement(sql);
            orden.setString(1, contraseña);
            orden.setString(2, nombre);
            orden.setString(3, apellido);
            orden.setString(4, perfil);
            orden.setString(5, usuario);
            
            orden.executeUpdate();
            JOptionPane.showMessageDialog(null, "INFORMACIÓN MODIFICADA EXITOSAMENTE");
            bien=true;
                        
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR LA INFORMACIÓN EN LA BASE DE DATOS");
            bien=false;
        }

       return bien;
   }
   
   
   
   
   /*EL SIGUIENTE METODO CREA UN ASISTENTE NUEVO RECIBIENDO COMO PARAMETROS LAS INFORMACIONES INSERTADAS EN EL
   FORMULARIO*/
   public void crearasistente(String nombre, String apellido, String direccion, String sexo, String email, String telefono){
             
        String insert="INSERT INTO asistente VALUES(?,?,?,?,?,?)";
        Boolean bien=false;    
        
         try{ 
           this.conectar();
           PreparedStatement orden= con.prepareStatement(insert);
       
            orden.setString(1,nombre);
            orden.setString(2,apellido);
            orden.setString(3,direccion);
            orden.setString(4,sexo);
            orden.setString(5,email);
            orden.setString(6, telefono);
            
            orden.executeUpdate();
            JOptionPane.showMessageDialog(null,"ASISTENTE CREADO EXITOSAMENTE");
            
            orden.close();
            con.close();
         } catch (SQLException ex) {    
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"ERROR CON AL INTENTAR INSERTAR ASISTENTE NUEVO");
        }    
    }
   
   
   /*EL SIGUIENTE METODO RECIBE UN ID ED UN ASISTENTE
   Y OBTIENE TODA LA INFORMACIÒN DE ESE ASISTENTE Y LA GUARDA
   EN UN ARRAYÑIST*/
   
   public ArrayList getinfoasistente(int id){
       
    Boolean bien=false;   
    ArrayList<String> info= new ArrayList<String>();   
    this.conectar();
    
     Boolean confirm= this.validasistente(id);
       
       if(confirm){//PRIMERO SE VALIDA QUE EL ID DEL ASISTENTE EXISTA
                   //SI EXISTE SE EJECUTA EL PROCESO DE OBTENER LA INFORMACIÒN
    String sql="SELECT*FROM asistente WHERE id_asistente=?";    
    
        try {
            PreparedStatement orden= con.prepareStatement("SELECT * FROM asistente WHERE id_asistente=?");
            orden.setInt(1,id);
            
            ResultSet result= orden.executeQuery();
            
            
            //CON LA INFORMACIÒN OBTENIDA DEL RESULTSET SE HACE UN ARRAYLIST
            //Y SE GUARDA LA INFORMACIÒN EN DICHO ARREGLO
            while(result.next()){
            String nombre= (String)result.getString(2);
            String apellido= (String)result.getString(3);
            String direccion=(String)result.getString(4);
            String sexo=(String)result.getString(5);
            String email=(String)result.getString(6);
            String telefono=(String)result.getString(7);
            
           
            info.add(nombre);
            info.add(apellido);
            info.add(direccion);
            info.add(sexo);
            info.add(email);
            info.add(telefono);
            }
   
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR CON LA BASE DE DATOS");
        }  
       }
       return info;
   }
   
   
   
   /*EL SIGUIENTE METODO RECIBE POR PARAMETRO UN ID DE ASISTENETE
    Y VERIFICA POR MEDIO DE UN SELECT SI EL ID DEL ASISTENTE INTRODUCIDO
    EXISTE EN LA BASE DE DATOS*/ 
   public Boolean validasistente(int id){
        
        Boolean bien=false;
        this.conectar();
        String sql="SELECT*FROM asistente WHERE id_asistente=?";
        
        try {
            PreparedStatement orden= con.prepareStatement(sql);
            orden.setInt(1, id);
            
            ResultSet rs= orden.executeQuery();
            
            if(rs.next()){
                bien=true;
            }else{
                JOptionPane.showMessageDialog(null, "ID DE ASISTENTE NO EXISTE");
            }
            
            
        } catch (SQLException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "ERROR AL CONECTAR CON LA BASE DE DATOS");
        }
        
        
        return bien;
    }
   
   
   
   /*ESTE METODO RECIBE POR PARAMETROS LAS INFORMACIONES QUE SE GUARDARÀN EN UN ASISTENTE YA EXISTENTE*/
   public Boolean modinfoasistente(int id,String nombre, String apellido, String direccion,String sexo,String email, String telefono){
       
       Boolean bien=false;
       this.conectar();
 
       String sql="UPDATE asistente SET nombre=? , apellido=? , direccion=?, sexo=?, email=?, telefono=? WHERE id_asistente=?";
       
        try {
            PreparedStatement orden= con.prepareStatement(sql);
            orden.setString(1, nombre);
            orden.setString(2, apellido);
            orden.setString(3, direccion);
            orden.setString(4, sexo);
            orden.setString(5, email);
            orden.setString(6, telefono);
            orden.setInt(7, id);
            
            orden.executeUpdate();
            JOptionPane.showMessageDialog(null, "INFORMACIÓN MODIFICADA EXITOSAMENTE");
            bien=true;
                        
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR LA INFORMACIÓN EN LA BASE DE DATOS");
            bien=false;
        }
       

       return bien;
   }
   

   /*EL SIGUIENTE METODO ELIMINA UN USUARIO DE LA BASE DE DATOS MEDIANTE UN ID
   INTRODUCIDO PREVIAMNETE*/
   public Boolean eliminarasis(int id){
       
       Boolean bien=false;
       this.conectar();
       
       Boolean confirm=this.validasistente(id);
       
       if(confirm){
       
       String sql="DELETE FROM asistente WHERE id_asistente=?";
       
        try {
            PreparedStatement orden= con.prepareStatement(sql);
            orden.setInt(1,id);
            
            orden.executeUpdate();
            bien=true;
            
            JOptionPane.showMessageDialog(null, "ASISTENTE ELIMINADO EXITOSAMENTE");
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"ERROR AL ELIMINAR ASISTENTE DE LA BASE DE DATOS");
            bien=false;
        }
        
       }
       return bien;
   }
   
   
   /*EL SIGUIENTE METODO CREA UNA OBRA RECIBIENDO COMO PARAMETROS LAS INFORMACIONES NECESARIAS*/
   public Boolean crearobra(String nombre, String fecha, String ubicacion, String tipo){
       Boolean bien=false;
       this.conectar();
       
       String sql="INSERT INTO obra VALUES(?,?,?,?)";
       
        try {
            PreparedStatement orden= con.prepareStatement(sql);
            orden.setString(1,nombre);
            orden.setString(2, fecha);
            orden.setString(3, ubicacion);
            orden.setString(4, tipo);
            
            orden.executeUpdate();
            JOptionPane.showMessageDialog(null, "OBRA CREADA EXITOSAMENTE");
            bien=true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR AL CREAR LA OBRA EN LA BASE DE DATOS \nVERIFIQUE QUE LOS DATOS ESTÉN BIEN ESCRITOS");
            bien=false;
        }
       
       
       return bien;
   }
   
   
   /*EL SIGUIENTE METODO VALIDA QUE UNA OBRA EXISTA BUSCANDOLA POR SU ID*/
   public Boolean validobra(int id){
       Boolean bien=false;
       this.conectar();
       
       String sql="SELECT*FROM obra WHERE id_obra=?";

        try {
            PreparedStatement orden = con.prepareStatement(sql);
            orden.setInt(1, id);
            
            ResultSet result= orden.executeQuery();

            if(result.next()){
            bien=true;
            }else{
                JOptionPane.showMessageDialog(null, "LA OBRA NO EXISTE");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR AL VERIFICAR LA EXISTENCIA DE LA OBRA EN LA BASE DE DATOS");
            bien=false;
        }
       
       
       return bien;
   }
   
   
   /*EL SIGUIENTE METODO MODIFICA LA INFORMACION DE UNA OBRA YA EXISTENTE*/
   public Boolean modinfobra(int id,String nombre, String fecha, String ubicacion, String tipo){
     
       this.conectar();
       Boolean bien=false;
       
       String sql="UPDATE obra SET nombre=?, fecha=?, ubicacion=?, tipo_obra=? WHERE id_obra=?";
       
        try {
            PreparedStatement orden= con.prepareStatement(sql);
            orden.setString(1, nombre);
            orden.setString(2, fecha);
            orden.setString(3, ubicacion);
            orden.setString(4, tipo);
            orden.setInt(5, id);
            
            orden.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS MODIFCADOS EXITOSAMENTE");
            bien=true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR LOS DATOS\n VERIQFIQUE QUE LOS DATOS ESTÉN BIEN ESCRITOS");
            bien=false;
        }
       
       
       
       return bien;
   }
   
   
   /*EL SIGUIENTE METODO GUARDA TODA LA INFORMACION DE UNA OBRA EN UN ARREGLO
   DADO EL ID DE LA OBRA*/
    
    public ArrayList getinfoobra(int id){
       
    Boolean bien=false;   
    ArrayList<String> info= new ArrayList<String>();   
    this.conectar();
    
     Boolean confirm= this.validobra(id);
       
       if(confirm){//PRIMERO SE VALIDA QUE EL ID DE LA OBRA EXISTA
                   //SI EXISTE SE EJECUTA EL PROCESO DE OBTENER LA INFORMACIÒN
        String sql="SELECT*FROM obra WHERE id_obra=?";    
    
        try {
            PreparedStatement orden= con.prepareStatement("SELECT * FROM obra WHERE id_obra=?");
            orden.setInt(1,id);
            
            ResultSet result= orden.executeQuery();
            
            
            //CON LA INFORMACIÒN OBTENIDA DEL RESULTSET SE HACE UN ARRAYLIST
            //Y SE GUARDA LA INFORMACIÒN EN DICHO ARREGLO
            while(result.next()){
            String nombre= (String)result.getString(2);
            String fecha= (String)result.getString(3);
            String ubicacion=(String)result.getString(4);
            String tipo=(String)result.getString(5);

            info.add(nombre);
            info.add(fecha);
            info.add(ubicacion);
            info.add(tipo);
          
            }
   
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR CON LA BASE DE DATOS");
        }  
       }
       return info;
   }
   
    
    /*EL SIGUIENTE METODO INSERTA UNA NUEVA ASISTENCIA EN LA TABLA EVENTO
    DE LA BASE DE DATOS RECIBIENDO EL ID DE LA OBRA Y EL ID DEL ASISTENTE*/
   public Boolean AgregarAsistenteObra(int id_obra, int id_asistente){
       Boolean bien=false;
       this.conectar();
       
       String sql="INSERT INTO evento VALUES(?,?,'AUSENTE')";
       
       PreparedStatement orden;
       
       //SE VERIFICA QUE EL ASISTENTE Y LA OBRA EXISTAN
       Boolean asis_bien=this.validasistente(id_asistente);
       Boolean obra_bien=this.validobra(id_obra);
       
       if(asis_bien && obra_bien){
        try {
            orden = con.prepareStatement(sql);
            orden.setInt(1, id_obra);
            orden.setInt(2,id_asistente);
            
            orden.executeUpdate();
            bien=true;
            JOptionPane.showMessageDialog(null, "ASISTENCIA REGISTRADA EXITOSAMENTE");
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR ASISTENCIA EN LA BASE DE DATOS");
            bien=false;
        }
       }
       

       return bien;
   }
   
   
   
   public Boolean EliminarAsistenciaObra(int id_obra, int id_asistente){
       
       Boolean bien=false;
       this.conectar();
       
       String sql="DELETE FROM evento WHERE id_obra=? AND id_asistente=?";
       
        try {
            PreparedStatement orden= con.prepareStatement(sql);
            orden.setInt(1, id_obra);
            orden.setInt(2, id_asistente);
            
            orden.executeUpdate();
            JOptionPane.showMessageDialog(null, "ASISNTENCIA ELIMINADA EXITOSAMENTE");
            
            bien=true;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR ASISTENCIA DE LA BASE DE DATOS");
            bien=false;
        }

       return bien;
   }
   
     /*EL SIGUIENTE METODO ES PARA COMPROBAR QUE LOS DATOS INTRODUCIDOS EN EL LOGION COINCIDAN
    CON ALGUN REGISTRO DE LA TABLA USUARIO CON PERFIL DE ADMINISTRADOR*/ 
    public Boolean validcajero(String usuario, String contraseña){
        Boolean bien=false;
        
        String query="SELECT*FROM usuario WHERE usuario=? AND contraseña=? AND perfil='CAJERO'";
        
        try {
            this.conectar();
            PreparedStatement orden= con.prepareStatement(query);
            orden.setString(1, usuario);
            orden.setString(2,contraseña);
            
            ResultSet result=orden.executeQuery();
            
            if(result.next()){//SI EL USUARIO ADMINISTRADOR Y LA CONTRASEÑA COINCIDEN, SE CREA UNA VENTANA NUEVA DE TIPO VADMIN
                JOptionPane.showMessageDialog(null, "BIENVENDIO");
                Vcajero vcajero= new Vcajero();
                vcajero.setVisible(true);
                bien=true;
            }else{
                JOptionPane.showMessageDialog(null,"USUARIO O CONTRASEÑA INCORRECTOS");
            }
            
            
        } catch (SQLException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR AL INTENTAR INICIAR SESION");
            bien=false;
        } /*catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        return bien;
    }
    
    
    
    /*EL SIGUIENTE METODO PONE PRESENTE A UN ASISTENTE DADO SU ID Y EL ID DE LA OBRA */
    public Boolean agregarasis(int id_asistente, int id_obra){
        Boolean bien=false;
        this.conectar();
        
        String sql="UPDATE evento SET estatus='PRESENTE' where id_asistente=? and id_obra=?";
        
        try {
            PreparedStatement orden= con.prepareStatement(sql);
            orden.setInt(1, id_asistente);
            orden.setInt(2, id_obra);
            
            orden.executeUpdate();
            bien=true;
            
            JOptionPane.showMessageDialog(null, "ASISTENTE AGREGADO A LISTA DE PRESENTES");
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            bien=false;
            JOptionPane.showMessageDialog(null, "ERROR AL CREAR ASISTENCIA EN LA BASE DE DATOS");
        }
        
        return bien;
    }
    
}
