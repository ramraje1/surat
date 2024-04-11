// public class thread1 {
//     public static void main(String[] args) {
//         char ch = 'A';
//         while (ch <= 'Z') {
//             System.out.print(ch + " ");
//             try {
//                 Thread.sleep(2000); // Delay of 2 seconds
//             } catch (InterruptedException e) {
//                 // e.printStackTrace();
//                 System.out.println("error");
//             }
//             ch++;
//         }
//     }
// }
public class thread1{
    public static void main(String[] args){
        char ch='A';
        while(ch<='Z'){
            System.out.print(ch+" ");
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                System.out.print("error");
            }
            ch++;
        }
    }
}