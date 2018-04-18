/*

 * Purpose: Data Structure and Algorithms Lab 2 Problem 1

 * Status: Complete and thoroughly tested

 * Last update: 02/01/18

 * Submitted:  02/01/18

 * Comment: test suite and sample run attached

 * @author: Cassandra Bailey

 * @version: 2018.02.01

 */
// ********************************************************
// Interface ListInterface for the ADT list.
// *********************************************************
public interface ListInterface
{
  boolean isEmpty();
  int size();
  void add(int index, Object item)
                  throws ListIndexOutOfBoundsException;
  Object get(int index)
                    throws ListIndexOutOfBoundsException;
  void remove(int index)
                     throws ListIndexOutOfBoundsException;
  void removeAll();
}  // end ListInterface
