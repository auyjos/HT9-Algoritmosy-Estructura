import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static Scanner scan=new Scanner(System.in);

    public static void main(String []args){

        boolean repetir1=true;

        try{

            do{
                System.out.println("Bienvenido al programa de atencion critica de pacientes");
                System.out.println("\nAntes de que todos estiren la pata veamos que pacientes deben ser atendidos primero");
                System.out.println("\nQue metodo prefiere usar\n1VectorHeap\n2Java Collection");
                String opcion1=scan.nextLine();
                int option1=Integer.parseInt(opcion1);

                if(option1==1){
                    repetir1=false;
                    
                    ArrayList<String> operations = getOperations();

                    for (String operation: operations) {
           
                        System.out.println("Operación: " + operation );
                    }
                    System.exit(0);
                }else if(option1==2){
                    repetir1=false;
                }else{
                    System.out.println("Opcion no valida");
                }
            }while(repetir1==false);

        }catch(Exception e){
            System.out.println("Opcion no valida");
        }
        


    }

    public static ArrayList<String> getOperations() {
        FileDialog dialog = new FileDialog((Frame) null, "Seleccion el archivo con las operaciones", 0);
        dialog.setMode(FileDialog.LOAD);
        dialog.setVisible(true);
        String dir = dialog.getDirectory() + dialog.getFile();
        System.out.println(dir);

        try {
            File file = new File(dir);

            if (!file.exists()) {
                file.createNewFile();
            }

            try {
                BufferedReader buffer = new BufferedReader(new FileReader(dir));
                ArrayList<String> data = new ArrayList<>();
                String line = buffer.readLine();

                while (line != null) {
                    data.add(line);
                    line = buffer.readLine();
                }

                return data;
            } catch (FileNotFoundException fnte) {
                fnte.printStackTrace();
                return null;
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
            return null;
        }
    }


    
}