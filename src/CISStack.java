import java.util.Arrays;

public class CISStack {

    // Array property.
    private Integer[] stack;

    // Size property.
    private int size;

    // Element count
    private int count;

    // Constructor.
    public CISStack(int a)
    {
        size = 0;
        stack = new Integer[a];
        count = -1;
    }

    // Push. This method pushes a value onto the top of the stack.
    public void push(int element)
    {
        stack[count + 1] = element;
        count ++;
        size ++;
    }

    // Pop. This method pops a value from the top of the stack.
    public int pop()
    {

        int temp = 0;
        if (count > -1)
        {
            temp = stack[count];
            stack[count] = null;
            count --;
            size --;
        }
        return temp;
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty()
    {
        if (count == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // size. Returns the size of the queue.
    public int size()
    {
        return size;
    }

    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2, pointer=1}

    @Override
    public String toString() {
        return "CISStack{" +
                "stack=" + Arrays.toString(stack) +
                ", size=" + size +
                ", pointer=" + count +
                '}';
    }

}
