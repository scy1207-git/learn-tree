package com.tester.learn.books.javastructure.CH08.CH08_06;

/**
 * Created by leosong on 16/7/24.
 */
public class CH08_06 {

    int process = 0;
    int size;


    void showdata(int a[])
    {
        int i;
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }

    void quick(int d[],int size,int lf,int rg)
    {
        int i,j,tmp;
        int lf_idx;
        int rg_idx;
        int t;
        if(lf<rg)
        {

            lf_idx = lf+1;
            rg_idx = rg;

            while(true)
            {
                for(i = lf +1;i<=rg;i++)
                {
                    if(d[i]>=d[lf])
                    {
                        lf_idx = i;
                        break;
                    }
                }
                for(j =rg;j>=lf+1;j--)
                {
                    if(d[j] <= d[lf])
                    {
                        rg_idx = j;
                        break;
                    }
                    rg_idx--;
                }

                if(lf_idx<rg_idx)
                {
                    tmp = d[lf_idx];
                    d[lf_idx] = d[rg_idx];
                    d[rg_idx] = tmp;
                }else
                {
                    break;
                }


            }




        }



    }


    public static void main(String[] args)
    {

        int a[] = {5,4,3,2,1};




    }


}
