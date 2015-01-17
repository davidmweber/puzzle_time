package co.horn.puzzle

import scala.util.Random

object PuzzleTime {
  
  type ??? = Nothing

  /**
   * Problem 01
   * P01 (*) Find the last element of a list.
   * Example:
   *  scala> last(List(1, 1, 2, 3, 5, 8))
   *  res0: Int = 8
   */
  def last[A](l: List[A]): A = l match {
    case head :: Nil ⇒ head
    case _ :: tail ⇒ last(tail)
    case Nil ⇒ throw new NoSuchElementException("Empty list cannot have a final element")
  }

  /**
   * Problem 02
   * Find the last but one element of a list.
   * Example:
   *  scala> penultimate(List(1, 1, 2, 3, 5, 8))
   *  res0: Int = 5
   */
  def penultimate[A](l: List[A]): A = ???

  /**
   * Problem 03
   * Find the K'th element. By convention, the first element in the list is element 0.
   * Example:
   *  scala> kth_element (2, List(1, 1, 2, 3, 5, 8))
   *  res0: Int = 2
   */
  def kth_element[A](k: Int, l: List[A]): A = ???

  /**
   * Problem 04
   * Find the number of elements of a list.
   * Example:
   *  scala> length(List(1, 1, 2, 3, 5, 8))
   *  res0: Int = 6
   */
   def count_elems[A](l: List[A]): Int = ???

  /**
   * Problem 05
   * Reverse a list.
   *   Example:
   *   scala> reverse(List(1, 1, 2, 3, 5, 8))
   * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
   */
  def reverse[A](l: List[A]): List[A] = ???

  /**
   * Problem 06
   * Find out whether a list is a palindrome.
   * Example:
   *   scala> isPalindrome(List(1, 2, 3, 2, 1))
   * res0: Boolean = true
   */
  def isPalindrome[A](l: List[A]): Boolean = ???

  /**
   * Problem 07
   * Flatten a nested list structure.
   *   Example:
   *   scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
   * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
   */
  def flatten[_](l: List[_]): List[_] =  ???
  
  /**
   * Problem 08
   * Eliminate consecutive duplicates of list elements.
   * If a list contains repeated elements they should be replaced with a
   * single copy of the element. The order of the elements should not be changed.
   *   Example:
   *   scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
   *   res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
   */
  def compress[A](l: List[A]): List[A] = ???

  /**
   * Problem 09
   * Pack consecutive duplicates of list elements into sublists.
   * If a list contains repeated elements they should be placed in separate sublists.
   *   Example:
   *   scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
   *   res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
   */
  def pack[A](l : List[A]) : List[List[A]] = ???

  /**
   * Problem 10
   * Run-length encoding of a list. Use the result of problem P09 to implement
   * the so-called run-length encoding data compression method. Consecutive
   * duplicates of elements are encoded as tuples (N, E) where N is the
   * number of duplicates of the element E.
   * Example:
   *   scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
   *   res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
   */
  def encode[A](l: List[A]): List[(Int,A)] = ???

  /**
   * Problem 11
   * Modify the result of problem P10 in such a way that if an element has
   * no duplicates it is simply copied into the result list. Only
   * elements with duplicates are transferred as (N, E) terms.
   * Example:
   *   scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
   *   res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
   */
  def encodeMod[A](l: List[A]): List[Any] = ???

  /**
   * Problem 12
   * Remove the Kth element from a list. Return the list and the removed
   * element in a Tuple. Elements are numbered from 0.
   * Example:
   *   scala> removeAt(1, List('a, 'b, 'c, 'd))
   *   res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
   */
  def removeAt[A](n: Int, l: List[A]): (List[A], A) = ???

  /**
   * Problem 13
   * Extract a given number of randomly selected elements from a list.
   * Example:
   *   scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
   *   res0: List[Symbol] = List('e, 'd, 'a)
   */
  def randomSelect[A](n: Int, l: List[A]): List[A] = ???

  /**
   * Problem 14
   * Generate a random permutation of the elements of a list.
   * Example:
   *   scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
   *   res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
   */
  def randomPermute1[A](ls: List[A]): List[A] = ???

}
