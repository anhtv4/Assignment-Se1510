


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


public class MyOption {

    public void writeCoachToFile(String id, String name, String email, String phone, String pass) {
        try {
            FileWriter fw = new FileWriter("coaches.dat", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(id + ";" + name + ";" + email + ";" + phone + ";" + pass);
            bw.newLine();
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public boolean Login(String email, String pass) {
        List<Coach> listC = readCoachFromFile();
        boolean check = false;
        for (Coach o : listC) {
            if (o.getEmail().equals(email) && o.getPassword().equals(pass)) {
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Login failed");
        } else {
            System.out.println("Login success");
        }
        return check;
    }

    public void writeQuestionToFile(String id, String date, String name, String shortDes,
            String fullDes, double mark, String category, String author) {
        try {
            FileWriter fw = new FileWriter("QBs.dat", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(id + ";" + date + ";" + name + ";" + shortDes + ";" + fullDes + ";" + mark + ";" + category + ";" + author);
            bw.newLine();
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public void writeUserToFile(String email, String pass) {
        try {
            FileWriter fw = new FileWriter("user.dat", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(email + ";" + pass);
            bw.newLine();
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
    public void writeContestToFile(String txt) {
        try {
            FileWriter fw = new FileWriter("Contest_TimeStamp.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(txt);
            bw.newLine();
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public List<Coach> readCoachFromFile() {
        List<Coach> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("coaches.dat");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String txts[] = line.split(";");
                list.add(new Coach(txts[0], txts[1], txts[2], txts[3], txts[4]));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        return list;
    }

    public List<Problem> returnQBFromFile() {
        List<Problem> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("QBs.dat");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String txt[] = line.split(";");
                list.add(new Problem(txt[0], txt[1], txt[2], txt[3],
                        txt[4], Double.parseDouble(txt[5]), txt[6], txt[7]));

            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        return list;
    }
    public int countContestFromFile() {
        int count = 0;
        try {
            FileReader fr = new FileReader("Contest_TimeStamp.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                count++;
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        return count;
    }
    public void readContestFromFile() {
        try {
            FileReader fr = new FileReader("Contest_TimeStamp.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
    }

    public void readQBFromFile() {
        List<Coach> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("QBs.dat");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String txts[] = line.split(";");
                System.out.println(txts[0] + "\t" + txts[2]);
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
    }

    public List<User> readUserFromFile() {
        List<User> list = new ArrayList<>();
        try {
            FileReader fr = new FileReader("user.dat");
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String txts[] = line.split(";");
                list.add(new User(txts[0], txts[1]));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
        return list;
    }
}
