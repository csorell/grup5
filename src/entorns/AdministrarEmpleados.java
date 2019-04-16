package entorns;

public class AdministrarEmpleados {

   public static float calcularSalarioBruto(String empleados,int ventasMes, int horasExtra) throws Exception{
       float salari = 0;


       
       if(empleados.compareTo("Vendedor") == 0)
           salari = 1000;
       else if (empleados.compareTo("Encargado") == 0)
           salari = 1500;
       else 
           throw new Exception();

       if(ventasMes>=1500)
           salari += 200;
       else if(ventasMes>=1000)
           salari += 100;

       salari += (horasExtra*20);

       return salari;
   }

   public static float calcularSalariNet(float salariBrut) throws Exception{

       if(salariBrut>=1500)
           return (float) (salariBrut * 0.82);
       else if(salariBrut>=1000)
           return  (float) (salariBrut*0.84);

       return salariBrut;
   }

}
