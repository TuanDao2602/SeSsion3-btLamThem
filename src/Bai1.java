import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);




        int[] array =new int[0];
        int sum=0;
        int sum2=0;
        int max;
        int min;

        do {
            System.out.println("*************Menu*****************");
            System.out.println("1 Nhập giá trị các phần tử mảng");
            System.out.println("2 Hiển thị giá trị các phần tử mảng");
            System.out.println("3 In giá trị các phần tử chẵn và tính tổng");
            System.out.println("4 In giá trị các phần tử có chỉ số lẻ và tính tổng");
            System.out.println("5 In các phần tử là số nguyên tố trong mảng");
            System.out.println("6 In giá trị max và giá trị min của mảng");
            System.out.println("7 sắp xếp mảng giảm dần");
            System.out.println("8 nhập vào 1 số nguyên thống kê số lượng phần tử có giá trị bằng giá trị nhập");
            System.out.println("9 thoát");
            System.out.println("10 sự lựa chọn của bạn là");

            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("nhập vào độ dài của mảng");
                    int n =Integer.parseInt(scanner.nextLine());
                     array =new int[n];


                    for (int i=0 ;i<array.length;i++) {
                        System.out.printf(" nhập vào phần tử của mảng %d ", (i + 1));
                        array[i] = Integer.parseInt(scanner.nextLine());
                    }
                    break;
                case 2:
                    System.out.println("các phần tử của mảng là: ");
                    for (int i=0; i <array.length;i++){
                        System.out.printf("%d\t",array[i]);

                    }
                    System.out.println("\n");
                    break;
                case 3:

                    System.out.println("các phần tử số chẵn là ");
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] % 2 ==0){
                            sum += array[i];
                            System.out.printf("%d\t",array[i]);
                        }
                    }
                    System.out.println("\n");
                    System.out.printf("tổng của các phần tử là %d ",sum);
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.println("các phần tử có chỉ số lẻ là");
                    for (int i=0;i<array.length;i++){
                        if (i%2==0){
                            continue;

                        }else {
                            sum2+=array[i];
                            System.out.printf("%d\t",array[i]);
                        }
                    }
                    System.out.println("\n");
                    System.out.printf("tổng các phần tử là %d",sum2);
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("các số là số nguyên tố là");
                    for (int i = 0; i < array.length; i++) {
                        if (array[i]>=2){
                            boolean check =false;
                            for (int j = 2; j < array[i]; j++) {
                                if (array[i]%j==0){
                                    check=true;
                                }

                            }
                            if (check!=true){
                                System.out.printf("%d\t",array[i]);
                            }
                        }
                        System.out.printf("\n");

                    }
                    break;
                case 6:
                    System.out.println("giá trị lớn nhất và nhỏ nhất là");
                    max = array[0];
                    for (int i=0;i<array.length;i++){
                        if (max < array[i]){
                            max = array[i];
                        }
                    }
                    min=array[0];
                    for (int i = 1;i<array.length;i++){
                        if (min >array[i]){
                            min =array[i];
                        }
                    }
                    System.out.println("\n");
                    System.out.printf("giá trị max là %d và min là %d ",max,min);
                    System.out.println("\n");
                    break;
                case 7:
                    System.out.printf("mảng sau khi sắp xếp là ");
                    for (int i = 0; i < array.length; i++) {
                        for (int j = i+1; j < array.length; j++) {
                           if (array[i] <array[j]){
                               int temp = array[i];
                               array[i]=array[j];
                               array[j]=temp;
                           }

                        }
                        System.out.printf("%d\t",array[i]);


                    }
                    System.out.printf("\n");
                    break;

                case 8:
                    System.out.printf("nhập vào 1 số nguyên");
                    int number = Integer.parseInt(scanner.nextLine());
                    int count =0;
                    for (int i=0 ;i<array.length;i++){
                        if (number== array[i]){
                            count++;
                        }
                    }
                    System.out.printf("số %d xuất hiện số lần là %d : ",number,count);
                    System.out.printf("\n");
                    break;
                case 9 :
                    System.exit(0);
                    break;
                default:
                    System.out.printf("nhập giá trị 0-9");
                    System.out.printf("\n");

            }







        }while (true);
    }
}
