import java.util.ArrayList;

public class job_squvence_prob {

    public class job{
        int deadline;
        int profit;
        int id;

        public job(int i,int d, int p){
            deadline = d;
            profit = p;
            id = i;
        }
    }
    public static void main(String args[]){

        int arr[][] = {
                        {4,20},
                        {1,10}, 
                        {1,40}, 
                        {1,30}
                    };

        ArrayList<job> jobs = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            job.add(new job(i, jobsInfo[i][0], jobsInfo[i][1]));
            
        }
    }
}
