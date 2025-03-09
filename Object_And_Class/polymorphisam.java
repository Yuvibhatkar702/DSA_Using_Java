public class polymorphisam {
    public static void main(String args[]){

        fetri f = new fetri(24, 45, 3, 4);
        System.out.println(f.Student);
        System.out.println(f.sb);
        System.out.println(f.nit);
        System.out.println(f.jd);
        for(int i=0; i<5; i++){
            f.ramdev[i] = i;
        }




        fetri f1 = new fetri(f);
        f.ramdev[0] = 10;
        for(int i=0; i<5; i++){
            System.out.print(f.ramdev[i] + " ");
        }
        for(int i=0; i<5; i++){
            System.out.print(f1.ramdev[i] + " "); 
        }



    }
}

class fetri{

    int Student,jd,sb,nit;
    int ramdev[];

    fetri(fetri f){
        this.Student = f.Student;
        this.sb = f.sb;
        this.nit = f.nit;
        this.jd = f.jd;

        ramdev = new int[5];
        // this.ramdev = f.ramdev;
        for(int i=0; i<5; i++){
            this.ramdev[i] = f.ramdev[i];
        }

    }

    fetri(int s, int j, int n, int b){
        this.Student = s;
        this.jd = j;
        this.nit = n;
        this.sb = b;
        ramdev = new int[5];
    }

}
