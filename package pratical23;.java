package pratical23;
import java.util.*;

class book {
String bookName, authorName,issue_Date,exp_date;

void new_book() {
    Scanner input = new Scanner(System.in);
    System.out.print("bookName:-");
    bookName = input.nextLine();
    System.out.print("authorName:-");
    authorName = input.nextLine();
    System.out.print("issue_Date:-");
    issue_Date = input.nextLine();
    System.out.print("exp_date:-");
    exp_date = input.nextLine();
       }

void find_book() {
    System.out.println(bookName + "\t\t" + authorName + "\t\t" + issue_Date+ "\t\t" + exp_date);
}
}

class IssueBook {
String bookName, authorName, STD_name;
int STD_no;

void new_IssueBook() {
    Scanner input = new Scanner(System.in);
    System.out.print(" bookName:-");
    bookName = input.nextLine();
    System.out.print(" authorName");
    authorName = input.nextLine();
    System.out.print("STD_Name:-");
    STD_name = input.nextLine();
    System.out.print("STD_no:-");
    STD_no = input.nextInt();

}

void find_IssueBook() {
	System.out.println(bookName +"\t\t" + authorName + "\t\t" + STD_name + "\t\t" + STD_no);;
}
}

class ReturnBook {
String bookName, authorName, STD_name;
int STD_no;

void new_ReturnBook(){
    Scanner input = new Scanner(System.in);
    System.out.print("bookname:-");
    bookName = input.nextLine();
    System.out.print("authorName:-");
    authorName = input.nextLine();
    System.out.print("STD_name:-");
    STD_name = input.nextLine();
    System.out.print("STD_no:-");
    STD_no = input.nextInt();

}

void find_ReturnBook() {
	 System.out.println(bookName + "\t\t" + authorName + "\t\t" + STD_name + "\t\t" + STD_no);
}
}

class PenaltyList {
String STD_name, STD_no, return_date;
int STD_fine;

void new_PenaltyList() {
    Scanner input = new Scanner(System.in);
    System.out.print("STD_name:-");
    STD_name = input.nextLine();
    System.out.print("STD_no:-");
    STD_no = input.nextLine();
    System.out.print("return_date:-");
    return_date = input.nextLine();
    System.out.print("STD_fine:-");
    STD_fine = input.nextInt();
        }

void find_PenaltyList() {
    System.out.println(STD_name+"\t\t"+STD_no+"\t\t" + return_date+"\t\t" + STD_fine);
}
}

public class LibraryManagement {
public static void main(String args[]) {

    String months[] = {
            "Jan",
            "Feb",
            "Mar",
            "Apr",
            "May",
            "Jun",
            "Jul",
            "Aug",
            "Sep",
            "Oct",
            "Nov",
            "Dec"
    };
    Calendar calendar = Calendar.getInstance();
    // System.out.println("--------------------------------------------------------------------------------");
    int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;
    System.out.println("\n--------------------------------------------------------------------------------");
    System.out.println("            * Welcome to Library Management System Project in Java *");
    System.out.println("--------------------------------------------------------------------------------");
    System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " "
            + calendar.get(Calendar.YEAR));
    System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE)
            + ":" + calendar.get(Calendar.SECOND));
    book[] d = new book[25];
    IssueBook[] l = new IssueBook[100];
    ReturnBook[] w = new ReturnBook[20];
    PenaltyList[] a = new PenaltyList[25];

    int i;
    for (i = 0; i < 25; i++)
        d[i] = new book();
    for (i = 0; i < 100; i++)
        l[i] = new IssueBook();
    for (i = 0; i < 20; i++)
        w[i] = new ReturnBook();
    for (i = 0; i < 20; i++)
        a[i] = new PenaltyList();

  
    d[0].bookName = "Ghanendra";
    d[0].authorName = "Marvel23";
    d[0].issue_Date = "3Fed";
    d[0].exp_date= "10May";
    d[1].bookName = "A scientific";
    d[1].authorName = "Dr.Vikram";
    d[1].issue_Date = "3Jun";
    d[1].exp_date= "10Aug";
    d[2].bookName = "Dr.Rekha";
    d[2].authorName = "Aravind Adiga";
    d[2].issue_Date = "3Jan";
    d[2].exp_date= "10Aug";
    d[3].bookName = "sky is gold";
    d[3].authorName = "Stephen King";
    d[3].issue_Date = "3Jan";
    d[3].exp_date= "10Oct";

    l[0].bookName = "silver";
    l[0].authorName = "Amir";
    l[0].STD_name = "Harsh";
    l[0].STD_no = 9;
    l[1].bookName = "Result";
    l[1].authorName = "Aryan";
    l[1].STD_name = "curran";
    l[1].STD_no = 19;
    l[2].bookName = "Earth";
    l[2].authorName = "Modi";
    l[2].STD_name = "Shah";
    l[2].STD_no = 2;
    l[3].bookName = "David";
    l[3].authorName = "David";
    l[3].STD_name = "Rowling";
    l[3].STD_no = 6;

    w[0].bookName = "silver";
    w[0].authorName = "ryan";
    w[0].STD_name = "Jayesh";
    w[0].STD_no = 9;
    w[1].bookName = "Result";
    w[1].authorName = "Om";
    w[1].STD_name = "Pankaj";
    w[1].STD_no = 19;
    w[2].bookName = "Earth";
    w[2].authorName = "Modi";
    w[2].STD_name = "Shah";
    w[2].STD_no = 2;
    w[3].bookName = "David";
    w[3].authorName = "SDavid";
    w[3].STD_name = "Rowling";
    w[3].STD_no = 6;

    a[0].STD_name = "silver";
    a[0].STD_no = "Ram";
    a[0].return_date = "10 August";
    a[0].STD_fine = 100;
    a[1].STD_name = "David";
    a[1].STD_no = "S. khan";
    a[1].return_date = "10 August";
    a[1].STD_fine = 100;
    a[2].STD_name = "Ganesh";
    a[2].STD_no = "Sram";
    a[2].return_date = "9 August";
    a[2].STD_fine = 100;
    a[3].STD_name = "Yauam";
    a[3].STD_no = "SKumar";
    a[3].return_date = "12 August";
    a[3].STD_fine = 100;


    Scanner input = new Scanner(System.in);
    int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
    while (status == 1) {

        System.out.println("\n                                    MAIN MENU                                    ");
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("1.Book  2.IssueBook  3.ReturnBook  4.PenaltyList                                   ");
        System.out.println("-----------------------------------------------------------------------------------");
        choice = input.nextInt();
        switch (choice) {
            case 1: {
                System.out.println(
                        "--------------------------------------------------------------------------------");
                System.out.println("                      *Book*                                          ");
                System.out.println(
                        "--------------------------------------------------------------------------------");
                s1 = 1;
                while (s1 == 1) {
                    System.out.println("1.Add New Entry\n2.Existing Book List");
                    c1 = input.nextInt();
                    switch (c1) {
                        case 1: {
                            d[count1].new_book();
                            count1++;
                            break;
                        }
                        case 2: {
                            System.out.println(
                                    "--------------------------------------------------------------------------------");
                            System.out.println("                 Book List                                          ");
                            System.out.println(
                                    "--------------------------------------------------------------------------------");
                            for (j = 0; j < count1; j++) {
                                d[j].find_book();
                            }
                            break;
                        }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s1 = input.nextInt();
                }
                break;
            }
            case 2: {
                System.out.println(
                        "--------------------------------------------------------------------------------");
                System.out.println("                     *IssueBook*");
                System.out.println(
                        "--------------------------------------------------------------------------------");
                s2 = 1;
                while (s2 == 1) {
                    System.out.println("1.Add New Entry\n2.Existing Patients List");
                    c1 = input.nextInt();
                    switch (c1) {
                        case 1: {
                            l[count2].new_IssueBook();
                            count2++;
                            break;
                        }
                        case 2: {
                            System.out.println(
                                    "--------------------------------------------------------------------------------");
                            System.out.println("                            IssueBook List");
                            System.out.println(
                                    "--------------------------------------------------------------------------------");
                            for (j = 0; j < count2; j++) {
                                l[j].find_IssueBook();
                            }
                            break;
                        }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s2 = input.nextInt();
                }
                break;
            }
            case 3: {
                s3 = 1;
                System.out.println(
                        "--------------------------------------------------------------------------------");
                System.out.println("                     *ReturnBook*");
                System.out.println(
                        "--------------------------------------------------------------------------------");
                while (s3 == 1) {
                    System.out.println("1.Add New Entry\n2. Existing Medicines List");
                    c1 = input.nextInt();
                    switch (c1) {
                        case 1: {
                            w[count3].new_ReturnBook();
                            count3++;
                            break;
                        }
                        case 2: {
                            System.out.println(
                                    "--------------------------------------------------------------------------------");
                            System.out.println("                    ReturnBook List                                   ");
                            System.out.println(
                                    "--------------------------------------------------------------------------------");
                            for (j = 0; j < count3; j++) {
                                w[j].find_ReturnBook();
                            }
                            break;
                        }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s3 = input.nextInt();
                }
                break;
            }
            case 4: {
                s4 = 1;
                System.out.println(
                        "--------------------------------------------------------------------------------");
                System.out.println("                    *PenaltyList*                                      ");
                System.out.println(
                        "--------------------------------------------------------------------------------");
                while (s4 == 1) {
                    System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                    c1 = input.nextInt();
                    switch (c1) {
                        case 1: {
                            a[count4].new_PenaltyList();
                            count4++;
                            break;
                        }
                        case 2: {
                            System.out.println(
                                    "--------------------------------------------------------------------------------");
                            System.out.println("                             Penalty List                             ");
                            System.out.println(
                                    "--------------------------------------------------------------------------------");
                            for (j = 0; j < count4; j++) {
                                a[j].find_PenaltyList();
                            }
                            break;
                        }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s4 = input.nextInt();
                }
                break;
            }

            default: {
                System.out.println(" You Have Enter Wrong Choice!!!");
            }
        }
        System.out.println("\nReturn to MAIN MENU Press 1");
        status = input.nextInt();
    }
}
}