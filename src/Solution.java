import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  // Complete the catAndMouse function below.
  static String catAndMouse(int x, int y, int z) {
    int catAMouseCDistance = Math.abs(x - z);
    int catBMouseCDistance = Math.abs(y - z);

    if (catAMouseCDistance == catBMouseCDistance) {
      return "Mouse C";
    }
    if (catAMouseCDistance < catBMouseCDistance) {
      return "Cat A";
    }
    if (catBMouseCDistance < catAMouseCDistance) {
      return "Cat B";
    }
    return "";
  }
}
