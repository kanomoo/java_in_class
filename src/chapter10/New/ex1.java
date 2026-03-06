// package chapter10.New;

// public class ex1 {
//     public static void main(String[] args) {
//         Ex1Student std = new Ex1Student("6806021612037", "Phapavint", "Thitichunhakun");
//         std.setSubject(new Ex1Subject("12316", "sdfdsf", 3));
//         std.setSubject(new Ex1Subject("12316", "sdfdsf", 3));
//         std.setSubject(new Ex1Subject("12316", "sdfdsf", 3));
//         std.setSubject(new Ex1Subject("12316", "sdfdsf", 3));
//         std.setSubject(new Ex1Subject("12316", "sdfdsf", 3));
//         std.setSubject(new Ex1Subject("12316", "sdfdsf", 3));
//         System.out.println(std);
//     }
// }

// class Ex1Subject {
//     private String code = "";
//     private String name = "";
//     private int credit = 3;

//     public Ex1Subject() {
//     }

//     public Ex1Subject(String code, String name, int credit) {
//         setCode(code);
//         setName(name);
//         setCredit(credit);
//     }

//     public String getCode() {
//         return code;
//     }

//     public void setCode(String code) {
//         this.code = code;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public int getCredit() {
//         return credit;
//     }

//     public void setCredit(int credit) {
//         this.credit = credit;
//     }

//     public String toString() {
//         return getCode() + " : " + getName() + " : " + getCredit();
//     }
// }

// class Ex1Student {
//     private String id = "";
//     private String name = "";
//     private String surname = "";
//     private Ex1Subject subject[] = new Ex1Subject[8];
//     private int index = 0;

//     public Ex1Student(String id, String name, String surname) {
//         this.id = id;
//         this.name = name;
//         this.surname = surname;
//     }

//     public Ex1Student() {
//     }

//     public String getId() {
//         return id;
//     }

//     public void setId(String id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getSurname() {
//         return surname;
//     }

//     public void setSurname(String surname) {
//         this.surname = surname;
//     }

//     public Ex1Subject getSubject(int index) {
//         return subject[index];
//     }

//     public void setSubject(Ex1Subject sub) {
//         if (index < subject.length) {
//             this.subject[index] = sub;
//             index++;
//         }
//     }

//     public int getIndex() {
//         return index;
//     }

//     public void setIndex(int index) {
//         this.index = index;
//     }

//     public String toString() {
//         String output = "";
//         output = getId() + " : " + getName() + " : " + getSurname() + "\n";
//         for (int n = 0; n < index; n++)
//             output += "Subject " + (n + 1) + " : " + subject[n].toString() + "\n";
//         return output;
//     }
// }

package chapter10.New;

public class ex1 {
    public static void main(String[] args) {
        Ex1Student std = new Ex1Student("6806021612037", "Paphavin", "Thitichunhakun");
        std.setSubject(new Subject("060243103", "Computer Programming", 3));
        System.out.println(std);
    }

}

class Ex1Student {
    private String id = "", name = "", surname = "";
    private Subject subject[] = new Subject[8];
    private int index = 0;

    public Ex1Student() {
    }

    public Ex1Student(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setSubject(Subject sub) {
        if (index < subject.length) {
            this.subject[index] = sub;
            index++;
        }
    }

    public Subject getSubject(int index) {
        return subject[index];
    }

    public String toString() {
        String output = "";
        output += getId() + " : " + getName() + " : " + getSurname() + "\n";
        for (int i = 0; i < index; i++)
            output += "Subject " + (i + 1) + " : " + subject[i].toString() + "\n";
        return output;
    }
}

class Ex1Subject {
    private String id = "", name = "";
    private int credit = 0;

    public Ex1Subject() {
    }

    public Ex1Subject(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
