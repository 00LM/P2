// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/T2.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class T2 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object A=null;
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=6;
      if ($opEqualY($invokeField("length",args),0)) {
        $line=6;
        A=$fix(GCollections.asSet('a','b','c'));
      }
      else {
        $line=8;
        gold.structures.set.ISet $v1=$newSet();
        int $v3=$int(0);
        int $v4=$int($invokeMethod("length",((java.lang.String[])args)[$int(0)],new Object[]{}))-1;
        $v2:for (int i=$v3; i<=$v4; i++) {
          $v1.add($invokeMethod("charAt",((java.lang.String[])args)[$int(0)],new Object[]{i}));
        }
        A=$fix($opDiffeY($v1,GCollections.asSet('&')));
      }
      $line=12;
      Object coder=$fix(T2.createCoder());
      $line=13;
      Object decoder=$fix(T2.createCoder());
      $line=14;
      Utilities.testCodeDecode($cast(gold.structures.automaton.ITransducer.class,coder),$cast(gold.structures.automaton.ITransducer.class,decoder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,T2.class,"main",$line);
    }
  }
  public static ITransducer createCoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=22;
      Object Ls=$fix(A);
      $line=23;
      Object M0=$fix(GCollections.asSet(""));
      $line=24;
      gold.structures.set.ISet $v5=$newSet();
      $v6:for (Object a:GCollections.unmodifiableCollection(Ls)) {
        $v5.add($opAdditY("",a));
      }
      Object M1=$fix($v5);
      $line=25;
      gold.structures.set.ISet $v7=$newSet();
      $v8:for (Object a:GCollections.unmodifiableCollection(Ls)) {
        for (Object b:GCollections.unmodifiableCollection(Ls)) {
          $v7.add($opAdditY($opAdditY("",a),b));
        }
      }
      Object M2=$fix($v7);
      $line=26;
      gold.structures.set.ISet $v9=$newSet();
      $v10:for (Object a:GCollections.unmodifiableCollection(Ls)) {
        for (Object b:GCollections.unmodifiableCollection(Ls)) {
          for (Object c:GCollections.unmodifiableCollection(Ls)) {
            $v9.add($opAdditY($opAdditY($opAdditY("",a),b),c));
          }
        }
      }
      Object M3=$fix($v9);
      $line=28;
      gold.structures.set.ISet $v11=$newSet();
      $v12:for (Object s:GCollections.unmodifiableCollection($opUnionY($opUnionY($opUnionY(M0,M1),M2),M3))) {
        $v11.add(GCollections.asList(s));
      }
      gold.structures.set.ISet $v13=$newSet();
      $v14:for (Object a:GCollections.unmodifiableCollection(M3)) {
        for (Object b:GCollections.unmodifiableCollection($opUnionY($opUnionY($opUnionY(M0,M1),M2),M3))) {
          $v13.add(GCollections.asList(a,b));
        }
      }
      gold.structures.set.ISet $v15=$newSet();
      $v16:for (Object a:GCollections.unmodifiableCollection(M3)) {
        for (Object b:GCollections.unmodifiableCollection(M0)) {
          $v15.add(GCollections.asList(a,b,"&"));
        }
      }
      Object Q=$fix($opUnionY($opUnionY($opUnionY($v11,$v13),$v15),GCollections.asSet("E","F")));
      $line=33;
      System.out.println($message(new Object[]{Q}));
      $line=35;
      Object \u03A3=$fix($opUnionY(A,GCollections.asSet('&')));
      $line=36;
      Object O=$fix($opUnionY(\u03A3,GCollections.asSet('!','*','?')));
      $line=37;
      Object q_0=$fix(GCollections.asList(""));
      $line=38;
      gold.structures.set.ISet $v17=$newSet();
      $v18:for (Object a:GCollections.unmodifiableCollection(M3)) {
        for (Object b:GCollections.unmodifiableCollection(M0)) {
          $v17.add(GCollections.asList(a,b,"&"));
        }
      }
      Object F=$fix($v17);
      $line=39;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,O,q_0,F,new GMethod(T2.class,"\u03B4"),new GMethod(T2.class,"g"),new GMethod(T2.class,"h")});
      if (true) break $try;
      $line=40;
      $rethrow(new RuntimeException("The function \"createCoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,T2.class,"createCoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object g(Object x) {
    int $line=0;
    Object $result=null;
    $try:try {
      $result="";
      if (true) break $try;
      $line=42;
      $rethrow(new RuntimeException("The function \"g(x:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,T2.class,"g",$line);
    }
    return $result;
  }
  public static String reverse(String s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=46;
      String r=null;
      r=$defaultValue(String.class);
      $line=47;
      Integer i=null;
      i=$defaultValue(Integer.class);
      $line=49;
      r=$cast(String.class,$fix(""));
      $line=50;
      i=$cast(Integer.class,$fix($opSubtrY(((java.lang.String)s).length(),1)));
      $line=52;
      while (true) {
        if (!($opGreaqY(i,0))) break;
        $line=53;
        r=$cast(String.class,$fix($opAdditY(r,((java.lang.String)s).charAt($int(i)))));
        $line=54;
        i=$cast(Integer.class,$fix($opSubtrY(i,1)));
      }
      $line=57;
      $result=r;
      if (true) break $try;
      $line=58;
      $rethrow(new RuntimeException("The function \"reverse(s:String)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,T2.class,"reverse",$line);
    }
    return $cast(String.class,$result);
  }
  public static Object isPalindrome(Object cadena) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=62;
      Integer left=null;
      left=$defaultValue(Integer.class);
      $line=63;
      Integer right=null;
      right=$defaultValue(Integer.class);
      $line=64;
      left=$cast(Integer.class,$fix(0));
      $line=65;
      right=$cast(Integer.class,$fix($opSubtrY($invokeMethod("length",cadena,new Object[]{}),1)));
      $line=67;
      while (true) {
        if (!($opLesstY(left,right))) break;
        $line=68;
        if (!$opEqualY($invokeMethod("charAt",cadena,new Object[]{left}),$invokeMethod("charAt",cadena,new Object[]{right}))) {
          $line=69;
          $result=false;
          if (true) break $try;
        }
        $line=71;
        left=$cast(Integer.class,$fix($opAdditY(left,1)));
        $line=72;
        right=$cast(Integer.class,$fix($opSubtrY(right,1)));
      }
      $line=74;
      $result=true;
      if (true) break $try;
      $line=75;
      $rethrow(new RuntimeException("The function \"isPalindrome(cadena:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,T2.class,"isPalindrome",$line);
    }
    return $result;
  }
  public static Object \u03B4(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=79;
      String actualPalabra=null;
      actualPalabra=$defaultValue(String.class);
      $line=80;
      String anteriorPalabra=null;
      anteriorPalabra=$defaultValue(String.class);
      $line=81;
      Integer progreso=null;
      progreso=$defaultValue(Integer.class);
      $line=82;
      String salida=null;
      salida=$defaultValue(String.class);
      $line=83;
      String temp=null;
      temp=$defaultValue(String.class);
      $line=84;
      String nuevaPalabra=null;
      nuevaPalabra=$defaultValue(String.class);
      $line=86;
      if (($opEqualY(q,"E")||$opEqualY(q,"F"))) {
        $line=87;
        $result="E";
        if (true) break $try;
      }
      else {
        $line=92;
        if ($opEqualY($opAbsolY(q),1)) {
          $line=93;
          actualPalabra=$cast(String.class,$fix($getArrayValue(q,new Object[]{0})));
          $line=94;
          if (($opEqualY(((java.lang.String)actualPalabra).length(),0)&&!$opEqualY(\u03C3,'&'))) {
            $line=95;
            $result=GCollections.asList($opAdditY("",\u03C3));
            if (true) break $try;
          }
          else {
            $line=96;
            if (($opEqualY(((java.lang.String)actualPalabra).length(),1)&&!$opEqualY(\u03C3,'&'))) {
              $line=97;
              $result=GCollections.asList($opAdditY($opAdditY("",actualPalabra),\u03C3));
              if (true) break $try;
            }
            else {
              $line=98;
              if (($opEqualY(((java.lang.String)actualPalabra).length(),2)&&!$opEqualY(\u03C3,'&'))) {
                $line=99;
                $result=GCollections.asList($opAdditY($opAdditY("",actualPalabra),\u03C3));
                if (true) break $try;
              }
              else {
                $line=100;
                if (($opEqualY(((java.lang.String)actualPalabra).length(),3)&&$opEqualY(\u03C3,'&'))) {
                  $line=101;
                  $result=GCollections.asList(actualPalabra,"","&");
                  if (true) break $try;
                }
                else {
                  $line=103;
                  $result="E";
                  if (true) break $try;
                }
              }
            }
          }
        }
        else {
          $line=107;
          if ($opEqualY($opAbsolY(q),2)) {
            $line=108;
            anteriorPalabra=$cast(String.class,$fix($getArrayValue(q,new Object[]{0})));
            $line=109;
            actualPalabra=$cast(String.class,$fix($getArrayValue(q,new Object[]{1})));
            $line=110;
            if (($opEqualY(((java.lang.String)actualPalabra).length(),1)&&!$opEqualY(\u03C3,'&'))) {
              $line=111;
              $result=GCollections.asList(anteriorPalabra,$opAdditY($opAdditY("",actualPalabra),\u03C3));
              if (true) break $try;
            }
            else {
              $line=112;
              if (($opEqualY(((java.lang.String)actualPalabra).length(),2)&&!$opEqualY(\u03C3,'&'))) {
                $line=113;
                $result=GCollections.asList(anteriorPalabra,$opAdditY($opAdditY("",actualPalabra),\u03C3));
                if (true) break $try;
              }
              else {
                $line=114;
                if (($opEqualY(((java.lang.String)actualPalabra).length(),3)&&$opEqualY(\u03C3,'&'))) {
                  $line=115;
                  $result=GCollections.asList(actualPalabra,"","&");
                  if (true) break $try;
                }
                else {
                  $line=117;
                  $result="E";
                  if (true) break $try;
                }
              }
            }
          }
          else {
            $line=119;
            if ($opEqualY($opAbsolY(q),3)) {
              $line=120;
              anteriorPalabra=$cast(String.class,$fix($getArrayValue(q,new Object[]{0})));
              $line=121;
              actualPalabra=$cast(String.class,$fix($getArrayValue(q,new Object[]{1})));
              $line=122;
              if ((($opEqualY(((java.lang.String)anteriorPalabra).length(),3)&&$opEqualY(((java.lang.String)actualPalabra).length(),0))&&!$opEqualY(\u03C3,'&'))) {
                $line=123;
                $result=GCollections.asList(anteriorPalabra,$opAdditY("",\u03C3));
                if (true) break $try;
              }
              else {
                $line=125;
                $result="E";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=129;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,T2.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=134;
      String actualPalabra=null;
      actualPalabra=$defaultValue(String.class);
      $line=135;
      String anteriorPalabra=null;
      anteriorPalabra=$defaultValue(String.class);
      $line=136;
      Integer progreso=null;
      progreso=$defaultValue(Integer.class);
      $line=137;
      String salida=null;
      salida=$defaultValue(String.class);
      $line=138;
      String temp=null;
      temp=$defaultValue(String.class);
      $line=139;
      String nuevaPalabra=null;
      nuevaPalabra=$defaultValue(String.class);
      $line=141;
      if (($opEqualY(q,"E")||$opEqualY(q,"F"))) {
        $line=142;
        $result="";
        if (true) break $try;
      }
      else {
        $line=147;
        if ($opEqualY($opAbsolY(q),1)) {
          $line=148;
          actualPalabra=$cast(String.class,$fix($getArrayValue(q,new Object[]{0})));
          $line=149;
          if (($opEqualY(((java.lang.String)actualPalabra).length(),0)&&!$opEqualY(\u03C3,'&'))) {
            $line=150;
            $result=$opAdditY("",\u03C3);
            if (true) break $try;
          }
          else {
            $line=151;
            if (($opEqualY(((java.lang.String)actualPalabra).length(),1)&&!$opEqualY(\u03C3,'&'))) {
              $line=152;
              $result=$opAdditY("",\u03C3);
              if (true) break $try;
            }
            else {
              $line=153;
              if (($opEqualY(((java.lang.String)actualPalabra).length(),2)&&!$opEqualY(\u03C3,'&'))) {
                $line=154;
                $result=$opAdditY("",\u03C3);
                if (true) break $try;
              }
              else {
                $line=155;
                if (($opEqualY(((java.lang.String)actualPalabra).length(),3)&&$opEqualY(\u03C3,'&'))) {
                  $line=156;
                  $result="&";
                  if (true) break $try;
                }
                else {
                  $line=158;
                  $result="";
                  if (true) break $try;
                }
              }
            }
          }
        }
        else {
          $line=162;
          if ($opEqualY($opAbsolY(q),2)) {
            $line=163;
            anteriorPalabra=$cast(String.class,$fix($getArrayValue(q,new Object[]{0})));
            $line=164;
            actualPalabra=$cast(String.class,$fix($getArrayValue(q,new Object[]{1})));
            $line=165;
            if (($opEqualY(((java.lang.String)actualPalabra).length(),0)&&!$opEqualY(\u03C3,'&'))) {
              $line=166;
              $result="";
              if (true) break $try;
            }
            else {
              $line=167;
              if (($opEqualY(((java.lang.String)actualPalabra).length(),1)&&!$opEqualY(\u03C3,'&'))) {
                $line=168;
                $result="";
                if (true) break $try;
              }
              else {
                $line=169;
                if (($opEqualY(((java.lang.String)actualPalabra).length(),2)&&!$opEqualY(\u03C3,'&'))) {
                  $line=170;
                  $result="";
                  if (true) break $try;
                }
                else {
                  $line=171;
                  if (($opEqualY(((java.lang.String)actualPalabra).length(),3)&&$opEqualY(\u03C3,'&'))) {
                    $line=172;
                    $result=T2.funcionRetorno(q,\u03C3);
                    if (true) break $try;
                  }
                  else {
                    $line=174;
                    $result="";
                    if (true) break $try;
                  }
                }
              }
            }
          }
          else {
            $line=177;
            $result="";
            if (true) break $try;
          }
        }
      }
      $line=179;
      $rethrow(new RuntimeException("The function \"h(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,T2.class,"h",$line);
    }
    return $result;
  }
  public static Object funcionRetorno(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=182;
      Object palabraAnterior=$fix($getArrayValue(q,new Object[]{0}));
      $line=183;
      Object palabraActual=$fix($getArrayValue(q,new Object[]{1}));
      $line=184;
      if (($opEqualY($invokeMethod("length",palabraAnterior,new Object[]{}),3)&&$opEqualY($invokeMethod("length",palabraActual,new Object[]{}),3))) {
        $line=185;
        if (($bool($invokeMethod("equals",palabraActual,new Object[]{palabraAnterior}))&&$bool(T2.isPalindrome(palabraAnterior)))) {
          $line=186;
          $result="?&";
          if (true) break $try;
        }
        else {
          $line=187;
          if (($bool($invokeMethod("equals",palabraActual,new Object[]{palabraAnterior}))&&$bool(!$bool(T2.isPalindrome(palabraAnterior))))) {
            $line=188;
            $result="*&";
            if (true) break $try;
          }
          else {
            $line=189;
            if (($bool($invokeMethod("equals",palabraActual,new Object[]{T2.reverse($cast(java.lang.String.class,palabraAnterior))}))&&$bool(!$bool(T2.isPalindrome(palabraAnterior))))) {
              $line=190;
              $result="!&";
              if (true) break $try;
            }
            else {
              $line=192;
              $result=$opAdditY(palabraActual,"&");
              if (true) break $try;
            }
          }
        }
      }
      else {
        $line=195;
        $result="";
        if (true) break $try;
      }
      $line=197;
      $rethrow(new RuntimeException("The function \"funcionRetorno(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,T2.class,"funcionRetorno",$line);
    }
    return $result;
  }
}
