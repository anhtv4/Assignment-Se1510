

import java.io.FileWriter;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Manager {

    public static void main(String[] args) {
        MyOption option = new MyOption();
        Validation v = new Validation();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        showMenu();
        //login for coach
        System.out.println("-----------Login for coach-----------");
        String email = v.getString("Input your mail: ");
        String pass = v.getString("Input password: ");
        if (!option.Login(email, pass)) {
            return;
        }
        while (true) {
            choice = v.getChoice();
            switch (choice) {
                case 1:
                    //change password coach
                    System.out.println("-----------Change password-----------");
                    String rePass = v.getString("Input new password: ");
                    List<Coach> listCC = option.readCoachFromFile();
                    for (Coach o : listCC) {
                        if (o.getEmail().equals(email)) {
                            o.setPassword(rePass);
                        }
                    }
                    try {
                        FileWriter fw = new FileWriter("coaches.dat");
                        for (Coach o : listCC) {
                            option.writeCoachToFile(o.getId(), o.getName(), o.getEmail(), o.getPhone(), o.getPassword());
                        }
                    } catch (Exception e) {
                    }
                    break;
                case 2:
                    //add new
                    System.out.println("-----------Add New Problem-----------");
                    String id = String.valueOf(option.returnQBFromFile().size() + 1);
                    String date = v.getString("Input date: ");
                    String name = v.getString("Input name: ");
                    String shortDes = v.getString("Input short desciption: ");
                    String fullDes = v.getString("Input full description: ");
                    double markWeight = v.getDouble("Input mark weight: ");
                    String category = v.getString("Input category(sql|cea|csi|prf|mae): ");
                    String author = v.getString("Input author: ");
                    option.writeQuestionToFile(id, date, name, shortDes, fullDes, markWeight, category, author);
                    break;
                case 3:
                    //update
                    System.out.println("-----------Update By Problem ID-----------");
                    String qid = v.getString("Input id(1-100): ");
                    date = v.getString("Input date: ");
                    name = v.getString("Input name: ");
                    shortDes = v.getString("Input short desciption: ");
                    fullDes = v.getString("Input full description: ");
                    markWeight = v.getDouble("Input mark weight: ");
                    category = v.getString("Input category(sql|cea|csi|prf|mae): ");
                    author = v.getString("Input author: ");
                    List<Problem> listPP = option.returnQBFromFile();
                    for (Problem o : listPP) {
                        if (o.getId().equals(qid)) {
                            o.setAuthor(author);
                            o.setCategory(category);
                            o.setDate(date);
                            o.setFullDescription(fullDes);
                            o.setMarkWeight(markWeight);
                            o.setName(name);
                            o.setShortDescription(shortDes);
                        }
                    }
                    try {
                        FileWriter fw = new FileWriter("coaches.dat");
                        for (Problem o : listPP) {
                            option.writeQuestionToFile(o.getId(), o.getDate(), o.getName(), o.getShortDescription(), o.getFullDescription(), o.getMarkWeight(), o.getCategory(), o.getAuthor());
                        }
                    } catch (Exception e) {
                    }
                    break;
                case 4:
                    //display list question
                    List<Problem> listP = option.returnQBFromFile();
                    for (Problem o : listP) {
                        System.out.println(o.getId() + "\t" + o.getName() + "\t" + o.getCategory());
                    }
                    break;
                case 5:
                    int contestId = option.countContestFromFile() + 1;
                    String dateContest = v.getString("Input date: ");
                    String contest = contestId + ";" + email + ";" + dateContest + ";";
                    List<Problem> listForContest = option.returnQBFromFile();
                    int size = listForContest.size();
                    Random r = new Random();
                    for (int i = 0; i < 4; i++) {
                        contest += listForContest.get(r.nextInt(size)).getId() + ";";
                    }
                    contest += listForContest.get(r.nextInt(size)).getId();
                    option.writeContestToFile(contest);
                    break;
                case 6:
                    option.readContestFromFile();
                    break;
            }
        }
    }

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1.Change password");
        System.out.println("2. Add New Problem");
        System.out.println("3. Update By Problem ID");
        System.out.println("4. display list question.");
        System.out.println("5.A list of all available problems in the QB");
        System.out.println("6.Generate a new Contest ");
        System.out.print("Please choose: ");
    }
}
