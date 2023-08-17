import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.*;


public class Matrix_Rotation_CF
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

    public static void main(String r[])
    {
        try
        {
            FastkReader in =new FastkReader();
            FastkWriter out=new FastkWriter();

            int test=in.nextInt();
            if(test>=1 && test<=1000)
            {
                while(test>0) {
                    int arr[][]=new int[2][2];
                    for(int i=0;i<2;i++)
                    {
                        for(int j=0;j<2;j++)
                        {
                            arr[i][j]=in.nextInt();
                        }
                    }

                    boolean flag=true;
                    for(int i=0;i<4;i++)
                    {
                        if(arr[0][0]<arr[1][0] && arr[0][0]<arr[0][1] && arr[0][1]>arr[0][0] &&arr[0][1]<arr[1][1] && arr[1][0]<arr[1][1])
                        {
                            flag=false;
                            System.out.println("Yes");
                        }
                        int temp=arr[0][0];
                        arr[0][0]=arr[1][0];
                        arr[1][0]=arr[1][1];
                        arr[1][1]=arr[0][1];
                        arr[0][1]=temp;


                    }
                    if(flag==true)
                    {
                        System.out.println("NO");
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


