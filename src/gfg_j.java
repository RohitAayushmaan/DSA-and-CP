import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
import static java.lang.Math.max;
import static java.lang.Math.min;
import static java.lang.Math.abs;
import static java.lang.System.out;
import static java.lang.System.setProperty;
import java.math.*;


public class gfg_j
{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next()
        {
            while(st==null || !st.hasMoreTokens())
            {
                try {
                    st=new StringTokenizer(br.readLine());
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        String nextLine() {
            String str="";
            try {
                str=br.readLine().trim();
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter{
        private final BufferedWriter bw;
        public FastWriter()
        {
            this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
        }
        public void print(Object object)throws IOException{
            bw.append(""+object);
        }
        public void println(Object object)throws IOException{
            print(object);
            bw.append("\n");
        }
        public void close()throws IOException {
            bw.close();

        }

    }



    public static void main(String r[])
    {
        try
        {
            FastReader in =new FastReader();
            FastWriter out=new FastWriter();
            int a=in.nextInt();
            int k=in.nextInt();
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=0;i<a;i++)
            {

                arr.add(in.nextInt());
            }
            int max=Collections.max(arr);
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<max;i++)
            {
                if(arr.contains(i))
                    continue;
                else {
                    if(list.size()<k)
                        list.add(i);
//                    else{
//                        break;
//                    }
                }
            }
            if(list.size()<k)
            {
                int si=k-list.size();
                System.out.println(max+si);
            }
            else {
                System.out.println(list.get(k-1));
            }
            System.out.println(list);


            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}

