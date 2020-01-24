//************************************************************************************
//  Words2.java     Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of the super reference.
//************************************************************************************

public class Words2
{
    public static void main (String[] args)
    {
        //---------------------------------------------------------------------------
        //  Instantiates a derived class and invokes its inherited and
        //  local methods.
        //---------------------------------------------------------------------------

        Dictionary2 webster = new Dictionary2 (1500,52500);
        webster.pageMessage();
        webster.definitionMessage();
    }
}
/*Isabela Francisco
    p.5
 */
