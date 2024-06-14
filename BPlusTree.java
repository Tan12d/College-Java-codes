import java.util.Arrays;

class BPlusTreeNode 
{
    int[] data;
    BPlusTreeNode[] childPtr;
    boolean leaf;
    int n;

    BPlusTreeNode() 
    {
        data = new int[5];
        childPtr = new BPlusTreeNode[6];
        leaf = true;
        n = 0;
    }
}

public class rough 
{
    private static BPlusTreeNode root = null;

    public static BPlusTreeNode init() 
    {
        BPlusTreeNode np = new BPlusTreeNode();
        np.leaf = true;
        Arrays.fill(np.childPtr, null);
        return np;
    }

    public static void traverse(BPlusTreeNode p) 
    {
        System.out.println();
        
        for (int i = 0; i < p.n; i++) {
            
        	if (!p.leaf) 
        	{
                traverse(p.childPtr[i]);
            }
            System.out.print(p.data[i]+" ");
        }

        if (!p.leaf) 
        {
            traverse(p.childPtr[p.n]);
        }
        
        System.out.println();
    }

    public static void sort(int[] p, int n) 
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = i; j <= n; j++) 
            {
                if (p[i] > p[j]) 
                {
                    int temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                }
            }
        }
    }

    public static int splitChild(BPlusTreeNode x, int i) 
    {
        int j, mid;
        BPlusTreeNode np1, y;
		BPlusTreeNode np3;
        np3 = init();
        np3.leaf = true;

        if (i == -1) 
        {
            mid = x.data[2];
            x.data[2] = 0;
            x.n--;

            np1 = init();
            np1.leaf = false;
            x.leaf = true;

            for (j = 3; j < 5; j++) 
            {
                np3.data[j - 3] = x.data[j];
                np3.childPtr[j - 3] = x.childPtr[j];
                np3.n++;
                x.data[j] = 0;
                x.n--;
            }

            for (j = 0; j < 6; j++) 
            {
                x.childPtr[j] = null;
            }

            np1.data[0] = mid;
            np1.childPtr[np1.n] = x;
            np1.childPtr[np1.n + 1] = np3;
            np1.n++;
            root = np1;
        } 
        
        else 
        {
            y = x.childPtr[i];
            mid = y.data[2];
            y.data[2] = 0;
            y.n--;

            for (j = 3; j < 5; j++) 
            {
                np3.data[j - 3] = y.data[j];
                np3.n++;
                y.data[j] = 0;
                y.n--;
            }

            x.childPtr[i + 1] = y;
            x.childPtr[i + 1] = np3;
        }

        return mid;
    }

    public static void insert(int a) 
    {
        int i, temp;
        BPlusTreeNode x = root;

        if (x == null)
        {
            root = init();
            x = root;
        }
        
        else
        {
            if (x.leaf && x.n == 5) 
            {
                temp = splitChild(x, -1);
                x = root;

                for (i = 0; i < x.n; i++)
                {
                    if ((a > x.data[i]) && (a < x.data[i + 1])) 
                    {
                        i++;
                        break;
                    } 
                    
                    else if (a < x.data[0]) 
                    {
                        break;
                    } 
                    
                    else 
                    {
                        continue;
                    }
                }
                x = x.childPtr[i];
            } 
            
            else
            {
                while (!x.leaf) 
                {
                    for (i = 0; i < x.n; i++) 
                    {
                        if ((a > x.data[i]) && (a < x.data[i + 1])) 
                        {
                            i++;
                            break;
                        } 
                        
                        else if (a < x.data[0]) 
                        {
                            break;
                        }
                        
                        else
                        {
                            continue;
                        }
                    }

                    if (x.childPtr[i].n == 5) 
                    {
                        temp = splitChild(x, i);
                        x.data[x.n] = temp;
                        x.n++;
                        continue;
                    } 
                    
                    else 
                    {
                        x = x.childPtr[i];
                    }
                }
            }
        }

        x.data[x.n] = a;
        sort(x.data, x.n);
        x.n++;
    }

    public static void main(String[] args) 
    {
        int i, n, t;
        
        System.out.println("Enter no. of elements to be inserted: 5");
        n = 5;
        
        int a[] = {1,3,2,9,7};
        
//        System.out.println("Enter the elements:");
        for (i = 0; i < n; i++) 
        {
            t = a[i];
            insert(t);
        }

        System.out.println("Traversal of B+ tree:");
        traverse(root);   
    }
}
