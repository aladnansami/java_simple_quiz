import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

    public class Quiz {

        public static void main(String[] args) throws IOException, ParseException{
            Scanner input = new Scanner(System.in);
            System.out.println("1.Add Quiz\n2.Start Quiz");
            System.out.print("Select one: ");
            int option = input.nextInt();

            if(option == 1) {
                quizBank();

            } else if (option == 2) {
                startQuiz();
            }
        }
        private static void quizBank() throws IOException, ParseException{
            char ch ='y';
            String filePath="./src/main/resources/QuestionBank.json";
            do {
                JSONParser jsonParser = new JSONParser();
                Object obj = jsonParser.parse(new FileReader(filePath));

                Scanner input = new Scanner(System.in);
                System.out.println("Please add a ques here: ");
                JSONObject quesBank = new JSONObject();
                quesBank.put("question",input.nextLine());

                System.out.println("Input options:");
                quesBank.put("Option a",input.nextLine());
                quesBank.put("Option b",input.nextLine());
                quesBank.put("Option c",input.nextLine());
                quesBank.put("Option d",input.nextLine());
                System.out.print("Please input the correct ans: ");
                quesBank.put("answer",input.next());

                JSONArray quesBankArray = (JSONArray) obj;
                quesBankArray.add(quesBank);

                FileWriter file = new FileWriter(filePath);
                file.write(quesBankArray.toJSONString());
                JSONArray quesBankString = quesBankArray;
                file.flush();
                file.close();
                System.out.print(quesBankArray);
                System.out.print(quesBankArray);
                System.out.println("\nDo you want to add more?[y/n]");
                ch=input.next().charAt(0);

            }
            while(ch!='n');
        }

        public static void startQuiz() throws IOException, ParseException{
            int point = 0;

            String filePath="./src/main/resources/question.json";

            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new FileReader(filePath));
            JSONArray quizArray = (JSONArray) obj;
            for(int i = 0; i < 5; i++) {
                int min = 1;
                int max = quizArray.size();
                int pos = (int)(Math.random()*(max-min+1)+min);

                JSONObject quizObject = (JSONObject) quizArray.get(pos);
                String name = (String) quizObject.get("question");
                String a = (String) quizObject.get("Option a");
                String b = (String) quizObject.get("Option b");
                String c = (String) quizObject.get("Option c");
                String d = (String) quizObject.get("Option d");
                System.out.println(name);
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);

                System.out.print("Give your answer: ");
                Scanner input = new Scanner(System.in);
                String givenAns = input.next();
                String ans = (String) quizObject.get("answer");

                if(givenAns.equals(ans)) {
                    System.out.println("Correct!");
                    point++;
                }
                else {
                    System.out.println("Not Correct!");
                }
            }
            System.out.println("Result: You got " + point + " out of 5");

        }

    }

