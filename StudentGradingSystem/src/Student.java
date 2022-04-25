public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int matSozNotu, int fizikSozNotu, int kimyaSozNotu) {

        if (mat >= 0 && mat <= 100 && matSozNotu>=0 && matSozNotu<=100) {
            this.mat.note = mat;
            this.mat.sozluNote=matSozNotu;
        }

        if (fizik >= 0 && fizik <= 100 && fizikSozNotu>=0 && fizikSozNotu<=100) {
            this.fizik.note = fizik;
            this.fizik.sozluNote=fizikSozNotu;
        }

        if (kimya >= 0 && kimya <= 100 && kimyaSozNotu>=0 && kimyaSozNotu<=100) {
            this.kimya.note = kimya;
            this.kimya.sozluNote=kimyaSozNotu;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage =
                ((this.fizik.note*0.80+this.fizik.sozluNote*0.20) +
                (this.kimya.note*0.80+this.kimya.sozluNote*0.20) +
                (this.mat.note*0.80+this.mat.sozluNote*0.20)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note+ " Matematik Sözlü Notu: "+this.mat.sozluNote);
        System.out.println("Fizik Notu : " + this.fizik.note+" Fizik Sözlü Notu: "+this.fizik.sozluNote);
        System.out.println("Kimya Notu : " + this.kimya.note+" Kimya Sözlü Notu: "+this.kimya.sozluNote);
    }

}