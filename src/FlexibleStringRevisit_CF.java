import java.util.*;
import java.lang.*;
import java.io.*;

//Rohit-01/02/2023
public class FlexibleStringRevisit_CF
{
    static class FastkReader{
        BufferedReader br;
        StringTokenizer st;
        public FastkReader()
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
    static class FastkWriter{
        private final BufferedWriter bw;
        public FastkWriter()
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
//    public static rec()

    public static void main(String r[])
    {
        try
        {
            FastkReader in =new FastkReader();
            FastkWriter out=new FastkWriter();

            int test=in.nextInt();
            if(test>=1 && test<=100000)
            {
                while(test>0) {
                    int lena=in.nextInt();
                    if(lena>=1 && lena<=1000000) {
                        String str1=in.next();
                        String str2=in.next();
                        long dp[]=new long[1000001];
                        dp[0]=1;
                        dp[1]=1;
                        for(int i=2;i<1000000;++i)
                        {
                            dp[i]=998244353-998244353/i*dp[998244353%i]%998244353;
                        }
                        int temp=0;
                        long x=1;
                        long y=1;
                        for(int i=0;i<lena;++i)
                        {
                            if(str1.charAt(i)!=str2.charAt(i))
                            {
                                temp+=1;
                            }
                        }






                    }
                    test--;
                }
            }
            out.close();
        }
        catch(Exception ex)
        {
            System.err.println("Error");
        }

    }
}


