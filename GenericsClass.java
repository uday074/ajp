public class GenericsClass<T> 
{
    T content;
    public GenericsClass(T content)
	{
        this.content = content;
    }

    public T getContent() 
	{
        return content;
    }

    public void setContent(T content) 
	{
        this.content = content;
    }

    public void printContent() 
	{
        System.out.println(content);
    }

    public static void main(String[] args)
	{
    
        GenericsClass<String> s = new GenericsClass<String>("Welcome to AJP Lab");
        s.printContent();
    }
}
