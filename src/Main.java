public class Main {



        public static void main(String[] args) {

            //Завдання 1.
            int a = 10;
            long b = 100;
            double c = 66.6;
            short d = -666;
            char e = 1;
            boolean f = true;
            float g = -1000;
            byte h = 122;


            //Звдання 2.
            System.out.println("Byte = " + Byte.MIN_VALUE);
            System.out.println("Byte = " + Byte.MAX_VALUE);
            System.out.println("Short = " + Short.MIN_VALUE);
            System.out.println("Short = " + Short.MAX_VALUE);
            System.out.println("Integer = " + Integer.MIN_VALUE);
            System.out.println("Integer = " + Integer.MAX_VALUE);
            System.out.println("Float = " + Float.MIN_VALUE);
            System.out.println("Float = " + Float.MAX_VALUE);
            System.out.println("Double = " + Double.MIN_VALUE);
            System.out.println("Double = " + Double.MAX_VALUE);





            //завдання3
            int [] array = new int [] {97 , 55 , 41 , 22 , 38 , 44 , 666 , 999 , 888 , 222};
            int minValue = array [0];
            int maxValeu = array [0];

            for (int i = 1 ; i < array.length;i++){
                if(array[i] > maxValeu){
                    maxValeu = array[i];
                }
            }
            System.out.println(maxValeu);


            for ( int i = 1 ; i < array.length; i++){
                if (array[i] < minValue ){
                    minValue = array[i];
                }
            }
            System.out.println(minValue);










        }

    }


