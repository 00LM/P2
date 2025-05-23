// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/ReplaceForxyz.gold"
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
public final class ReplaceForxyz {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object A=null;
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=27;
      if ($opEqualY($invokeField("length",args),0)) {
        $line=27;
        A=$fix(GCollections.asSet('a','c','t'));
      }
      else {
        $line=29;
        gold.structures.set.ISet $v1=$newSet();
        int $v3=$int(0);
        int $v4=$int($invokeMethod("length",((java.lang.String[])args)[$int(0)],new Object[]{}))-1;
        $v2:for (int i=$v3; i<=$v4; i++) {
          $v1.add($invokeMethod("charAt",((java.lang.String[])args)[$int(0)],new Object[]{i}));
        }
        A=$fix($opDiffeY($v1,GCollections.asSet('$','#')));
      }
      $line=32;
      $invokeMethod(ReplaceForxyz.class,"test",true,null,new Object[]{$invokeMethod(ReplaceForxyz.class,"createFA",true,null,new Object[]{})});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,ReplaceForxyz.class,"main",$line);
    }
  }
  public static ITransducer createFA() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=39;
      Object Ls=$fix(A);
      $line=40;
      Object M0=$fix(GCollections.asSet(""));
      $line=41;
      gold.structures.set.ISet $v5=$newSet();
      $v6:for (Object a:GCollections.unmodifiableCollection(Ls)) {
        $v5.add($opAdditY("",a));
      }
      Object M1=$fix($v5);
      $line=42;
      gold.structures.set.ISet $v7=$newSet();
      $v8:for (Object a:GCollections.unmodifiableCollection(Ls)) {
        for (Object b:GCollections.unmodifiableCollection($opDiffeY(Ls,GCollections.asSet(a)))) {
          $v7.add($opAdditY($opAdditY("",a),b));
        }
      }
      Object M2=$fix($v7);
      $line=43;
      gold.structures.set.ISet $v9=$newSet();
      $v10:for (Object a:GCollections.unmodifiableCollection(Ls)) {
        for (Object b:GCollections.unmodifiableCollection($opDiffeY(Ls,GCollections.asSet(a)))) {
          for (Object c:GCollections.unmodifiableCollection($opDiffeY(Ls,GCollections.asSet(b,a)))) {
            $v9.add($opAdditY($opAdditY($opAdditY("",a),b),c));
          }
        }
      }
      Object M3=$fix($v9);
      $line=44;
      gold.structures.set.ISet $v11=$newSet();
      $v12:for (Object s:GCollections.unmodifiableCollection($opUnionY($opUnionY($opUnionY(M1,M2),M3),M0))) {
        $v11.add(GCollections.asList(s));
      }
      gold.structures.set.ISet $v13=$newSet();
      $v14:for (Object s:GCollections.unmodifiableCollection(M3)) {
        int $v15=$int(0);
        int $v16=$int(2);
        for (int d=$v15; d<=$v16; d++) {
          $v13.add(GCollections.asList(s,d));
        }
      }
      Object Q=$fix($opUnionY($opUnionY($v11,$v13),GCollections.asSet("E","F")));
      $line=45;
      System.out.println($message(new Object[]{Q}));
      $line=47;
      Object \u03A3=$fix($opUnionY(A,GCollections.asSet('#',':')));
      $line=48;
      Object O=$fix($opUnionY(\u03A3,GCollections.asSet('$')));
      $line=49;
      Object q_0=$fix(GCollections.asList(""));
      $line=50;
      Object F=$fix(GCollections.asSet("F"));
      $line=51;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,\u03A3,O,q_0,F,new GMethod(ReplaceForxyz.class,"\u03B4"),new GMethod(ReplaceForxyz.class,"g"),new GMethod(ReplaceForxyz.class,"h")});
      if (true) break $try;
      $line=52;
      $rethrow(new RuntimeException("The function \"createFA()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,ReplaceForxyz.class,"createFA",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object g(Object x) {
    int $line=0;
    Object $result=null;
    $try:try {
      $result="";
      if (true) break $try;
      $line=54;
      $rethrow(new RuntimeException("The function \"g(x:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,ReplaceForxyz.class,"g",$line);
    }
    return $result;
  }
  public static Object test(ITransducer M) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=56;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=58;
      String string=null;
      string=$defaultValue(String.class);
      $line=61;
      boolean $v17=false;
      while (true) {
        if ($v17) {
          if ($opEqualY(string,"")) break;
        }
        $v17=true;
        $line=63;
        System.out.println($message(new Object[]{"----------------------------"}));
        $line=64;
        System.out.println($message(new Object[]{$opAdditY($opAdditY("Input a string of the form xyz:W. with xyz and W  over ",A),"  (end with an empty string)")}));
        $line=65;
        string=$cast(String.class,$fix(((java.util.Scanner)sc).nextLine()));
        $line=66;
        if (!$opEqualY(string,"")) {
          $line=67;
          Object result=$fix(((gold.structures.automaton.ITransducer)M).acceptsString($cast(java.lang.String.class,string)));
          $line=68;
          System.out.println($message(new Object[]{$opAdditY($opAdditY($opAdditY("The string was ",(($bool(result))?("accepted"):("not accepted"))),". Output: "),((gold.structures.automaton.ITransducer)M).getOutputString())}));
        }
      }
      $line=74;
      System.out.println($message(new Object[]{"Execution Terminated"}));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,ReplaceForxyz.class,"test",$line);
    }
    return $result;
  }
  public static Object \u03B4(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=79;
      String s=null;
      s=$defaultValue(String.class);
      $line=81;
      if (($opEqualY(q,"E")||$opEqualY(q,"F"))) {
        $line=82;
        $result="E";
        if (true) break $try;
      }
      else {
        $line=83;
        if ($opEqualY($opAbsolY(q),1)) {
          $line=84;
          s=$cast(String.class,$fix($getArrayValue(q,new Object[]{0})));
          $line=85;
          if ((($opEqualY(((java.lang.String)s).length(),0)&&!$opEqualY(\u03C3,'#'))&&!$opEqualY(\u03C3,':'))) {
            $line=86;
            $result=GCollections.asList($opAdditY("",\u03C3));
            if (true) break $try;
          }
          else {
            $line=87;
            if (((($opEqualY(((java.lang.String)s).length(),1)&&!$opEqualY(\u03C3,((java.lang.String)s).charAt($int(0))))&&!$opEqualY(\u03C3,'#'))&&!$opEqualY(\u03C3,':'))) {
              $line=88;
              $result=GCollections.asList($opAdditY($opAdditY("",s),\u03C3));
              if (true) break $try;
            }
            else {
              $line=89;
              if ((((($opEqualY(((java.lang.String)s).length(),2)&&!$opEqualY(\u03C3,((java.lang.String)s).charAt($int(0))))&&!$opEqualY(\u03C3,((java.lang.String)s).charAt($int(1))))&&!$opEqualY(\u03C3,'#'))&&!$opEqualY(\u03C3,':'))) {
                $line=90;
                $result=GCollections.asList($opAdditY($opAdditY("",s),\u03C3));
                if (true) break $try;
              }
              else {
                $line=91;
                if (($opEqualY(((java.lang.String)s).length(),3)&&$opEqualY(\u03C3,':'))) {
                  $line=92;
                  $result=GCollections.asList(s,0);
                  if (true) break $try;
                }
                else {
                  $line=94;
                  $result="E";
                  if (true) break $try;
                }
              }
            }
          }
        }
        else {
          $line=97;
          Object $v18=$getArrayValue(q,new Object[]{0});
          Object $v19=$getArrayValue(q,new Object[]{1});
          s=$cast(String.class,$fix($v18));
          Object p=$fix($v19);
          $line=98;
          if ($opEqualY(\u03C3,':')) {
            $line=98;
            $result="E";
            if (true) break $try;
          }
          else {
            $line=99;
            if ($opEqualY(\u03C3,'#')) {
              $line=99;
              $result="F";
              if (true) break $try;
            }
            else {
              $line=100;
              if (($opEqualY(p,0)&&$opEqualY(\u03C3,((java.lang.String)s).charAt($int(0))))) {
                $line=100;
                $result=GCollections.asList(s,1);
                if (true) break $try;
              }
              else {
                $line=101;
                if ($opEqualY(p,0)) {
                  $line=101;
                  $result=GCollections.asList(s,0);
                  if (true) break $try;
                }
                else {
                  $line=102;
                  if (($opEqualY(p,1)&&$opEqualY(\u03C3,((java.lang.String)s).charAt($int(0))))) {
                    $line=102;
                    $result=GCollections.asList(s,1);
                    if (true) break $try;
                  }
                  else {
                    $line=103;
                    if (($opEqualY(p,1)&&$opEqualY(\u03C3,((java.lang.String)s).charAt($int(1))))) {
                      $line=103;
                      $result=GCollections.asList(s,2);
                      if (true) break $try;
                    }
                    else {
                      $line=104;
                      if ($opEqualY(p,1)) {
                        $line=104;
                        $result=GCollections.asList(s,0);
                        if (true) break $try;
                      }
                      else {
                        $line=105;
                        if (($opEqualY(p,2)&&$opEqualY(\u03C3,((java.lang.String)s).charAt($int(0))))) {
                          $line=105;
                          $result=GCollections.asList(s,1);
                          if (true) break $try;
                        }
                        else {
                          $line=106;
                          $result=GCollections.asList(s,0);
                          if (true) break $try;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=109;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,ReplaceForxyz.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object \u03C3) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=113;
      String s=null;
      s=$defaultValue(String.class);
      $line=114;
      if (($opEqualY(q,"E")||$opEqualY(q,"F"))) {
        $line=115;
        $result="";
        if (true) break $try;
      }
      else {
        $line=116;
        if ($opEqualY($opAbsolY(q),1)) {
          $line=117;
          s=$cast(String.class,$fix($getArrayValue(q,new Object[]{0})));
          $line=118;
          if ($opEqualY(((java.lang.String)s).length(),0)) {
            $line=119;
            $result=$opAdditY("",\u03C3);
            if (true) break $try;
          }
          else {
            $line=120;
            if (($opEqualY(((java.lang.String)s).length(),1)&&!$opEqualY(\u03C3,((java.lang.String)s).charAt($int(0))))) {
              $line=121;
              $result=$opAdditY("",\u03C3);
              if (true) break $try;
            }
            else {
              $line=122;
              if ((($opEqualY(((java.lang.String)s).length(),2)&&!$opEqualY(\u03C3,((java.lang.String)s).charAt($int(0))))&&!$opEqualY(\u03C3,((java.lang.String)s).charAt($int(1))))) {
                $line=123;
                $result=$opAdditY("",\u03C3);
                if (true) break $try;
              }
              else {
                $line=124;
                if (($opEqualY(((java.lang.String)s).length(),3)&&$opEqualY(\u03C3,':'))) {
                  $line=125;
                  $result=":";
                  if (true) break $try;
                }
                else {
                  $line=126;
                  $result="";
                  if (true) break $try;
                }
              }
            }
          }
        }
        else {
          $line=129;
          Object $v20=$getArrayValue(q,new Object[]{0});
          Object $v21=$getArrayValue(q,new Object[]{1});
          s=$cast(String.class,$fix($v20));
          Object p=$fix($v21);
          $line=130;
          if ($opEqualY(\u03C3,'#')) {
            $line=130;
            $result=$opAdditY(((java.lang.String)s).substring($int(0),$int(p)),"#");
            if (true) break $try;
          }
          else {
            $line=131;
            if (($opEqualY(p,0)&&$opEqualY(\u03C3,((java.lang.String)s).charAt($int(0))))) {
              $line=131;
              $result="";
              if (true) break $try;
            }
            else {
              $line=132;
              if ($opEqualY(p,0)) {
                $line=132;
                $result=$opAdditY("",\u03C3);
                if (true) break $try;
              }
              else {
                $line=133;
                if (($opEqualY(p,1)&&$opEqualY(\u03C3,((java.lang.String)s).charAt($int(0))))) {
                  $line=133;
                  $result=((java.lang.String)s).charAt($int(0));
                  if (true) break $try;
                }
                else {
                  $line=134;
                  if (($opEqualY(p,1)&&$opEqualY(\u03C3,((java.lang.String)s).charAt($int(1))))) {
                    $line=134;
                    $result="";
                    if (true) break $try;
                  }
                  else {
                    $line=135;
                    if ($opEqualY(p,1)) {
                      $line=135;
                      $result=$opAdditY($opAdditY("",((java.lang.String)s).charAt($int(0))),\u03C3);
                      if (true) break $try;
                    }
                    else {
                      $line=136;
                      if (($opEqualY(p,2)&&$opEqualY(\u03C3,((java.lang.String)s).charAt($int(0))))) {
                        $line=136;
                        $result=$opAdditY($opAdditY("",((java.lang.String)s).charAt($int(0))),((java.lang.String)s).charAt($int(1)));
                        if (true) break $try;
                      }
                      else {
                        $line=137;
                        if (($opEqualY(p,2)&&$opEqualY(\u03C3,((java.lang.String)s).charAt($int(2))))) {
                          $line=137;
                          $result="$";
                          if (true) break $try;
                        }
                        else {
                          $line=138;
                          $result=$opAdditY($opAdditY($opAdditY("",((java.lang.String)s).charAt($int(0))),((java.lang.String)s).charAt($int(1))),\u03C3);
                          if (true) break $try;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      $line=141;
      $rethrow(new RuntimeException("The function \"h(q:Object,\u03C3:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,ReplaceForxyz.class,"h",$line);
    }
    return $result;
  }
}
