import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            String exp = scn.nextLine();
            exp = exp.replace("\"", "");
            String[] data;
            char action;
            if(exp.contains("+")) {
                data = exp.split("\\+");
                action='+';
            }
            else if(exp.contains("-")){
                data = exp.split("-");
                action='-';
            }
            else if(exp.contains("*")){
                data = exp.split("\\*");
                action='*';
                String[] data;
                if (exp.contains(" + ")) {
                    data = exp.split(" \\+ ");
                    action = '+';
                } else if (exp.contains(" - ")) {
                    data = exp.split(" - ");
                    action = '-';
                } else if (exp.contains(" * ")) {
                    data = exp.split(" \\* ");
                    action = '*';
                } else if (exp.contains(" / ")) {
                    data = exp.split(" / ");
                    action = '/';
                }else{
                    throw new Exception("Некорректный знак действия");
                }
        else {
                    data = exp.split("/");
                    action='/';
                    if (action == '*' || action == '/') {
                        if (data[1].contains("\"")) throw new Exception("Строчку можно делить или умножать только на число");
                    }
                    if(action == '+'){
                        System.out.println(data[0]+data[1]);
                        for (int i = 0; i < data.length; i++) {
                            data[i] = data[i].replace("\"", "");
                        }
        else if(action == '*'){

                            if (action == '+') {
                                printInQuotes(data[0] + data[1]);
                            } else if (action == '*') {
                                int multiplier = Integer.parseInt(data[1]);
                                String result = "";
                                for (int i = 0; i < multiplier; i++) {
                                    System.out.print(data[0]);
                                    result+=data[0];
                                }
                                printInQuotes(result);
                            } else if (action == '-') {
                                int index = data[0].indexOf(data[1]);
                                if(index == -1){
                                    printInQuotes(data[0]);
                                }else{
                                    String result = data[0].substring(0, index);
                                    result+=data[0].substring(index+data[1].length());
                                    printInQuotes(result);
                                }
                            }else{
                                int newLen = data[0].length()/Integer.parseInt(data[1]);
                                String result = data[0].substring(0,newLen);
                                printInQuotes(result);
                            }



                        }
                        static void printInQuotes(String text){
                            System.out.println("\""+text+"\"");
                        }
                    }