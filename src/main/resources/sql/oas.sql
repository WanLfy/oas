/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50540
Source Host           : 127.0.0.1:3306
Source Database       : oas

Target Server Type    : MYSQL
Target Server Version : 50540
File Encoding         : 65001

Date: 2017-11-15 18:28:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_exa_config
-- ----------------------------
DROP TABLE IF EXISTS `t_exa_config`;
CREATE TABLE `t_exa_config` (
  `id` int(11) NOT NULL,
  `choice_num` int(11) DEFAULT NULL,
  `choice_score` int(11) DEFAULT NULL,
  `judge_num` int(11) DEFAULT NULL,
  `judge_score` int(11) DEFAULT NULL,
  `short_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_exa_config
-- ----------------------------
INSERT INTO `t_exa_config` VALUES ('1', '5', '1', '3', '2', '1');

-- ----------------------------
-- Table structure for t_exa_template
-- ----------------------------
DROP TABLE IF EXISTS `t_exa_template`;
CREATE TABLE `t_exa_template` (
  `que_id` int(10) NOT NULL,
  `temp_id` int(10) NOT NULL,
  `post` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`que_id`,`temp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_exa_template
-- ----------------------------
INSERT INTO `t_exa_template` VALUES ('1', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('2', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('3', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('4', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('5', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('6', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('7', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('8', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('9', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('10', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('11', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('12', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('13', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('14', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('15', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('16', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('17', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('18', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('19', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('20', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('21', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('22', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('23', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('24', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('25', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('26', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('27', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('28', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('29', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('30', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('31', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('32', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('33', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('34', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('35', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('36', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('37', '1', '2017java');
INSERT INTO `t_exa_template` VALUES ('38', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('39', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('40', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('41', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('42', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('43', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('44', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('45', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('46', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('47', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('48', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('49', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('50', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('51', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('52', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('53', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('54', '2', '2017c');
INSERT INTO `t_exa_template` VALUES ('55', '3', '2017java');

-- ----------------------------
-- Table structure for t_que_answer
-- ----------------------------
DROP TABLE IF EXISTS `t_que_answer`;
CREATE TABLE `t_que_answer` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `que_id` int(11) NOT NULL,
  `answer` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_que_answer
-- ----------------------------
INSERT INTO `t_que_answer` VALUES ('1', '3', '0');
INSERT INTO `t_que_answer` VALUES ('2', '9', '0');
INSERT INTO `t_que_answer` VALUES ('3', '16', '0');
INSERT INTO `t_que_answer` VALUES ('4', '8', '1');
INSERT INTO `t_que_answer` VALUES ('5', '19', '1');
INSERT INTO `t_que_answer` VALUES ('6', '28', '10');
INSERT INTO `t_que_answer` VALUES ('7', '30', '132');
INSERT INTO `t_que_answer` VALUES ('8', '5', '3');
INSERT INTO `t_que_answer` VALUES ('9', '31', '39');
INSERT INTO `t_que_answer` VALUES ('10', '23', '52');
INSERT INTO `t_que_answer` VALUES ('11', '14', 'abstract');
INSERT INTO `t_que_answer` VALUES ('12', '17', 'AES');
INSERT INTO `t_que_answer` VALUES ('13', '4', 'constructor在一个对象被new时执行');
INSERT INTO `t_que_answer` VALUES ('14', '17', 'DES');
INSERT INTO `t_que_answer` VALUES ('15', '12', 'double');
INSERT INTO `t_que_answer` VALUES ('16', '26', 'FileInputStream in = new FileInputStream(\"file.dat\");in.skip(9);int c = in.read();');
INSERT INTO `t_que_answer` VALUES ('17', '26', 'FileInputStream in = new FileInputStream(\"file.dat\");in.skip(9);int c = in.readByte();');
INSERT INTO `t_que_answer` VALUES ('18', '27', 'FileNotFoundException');
INSERT INTO `t_que_answer` VALUES ('20', '14', 'final');
INSERT INTO `t_que_answer` VALUES ('21', '1', 'getPriority()');
INSERT INTO `t_que_answer` VALUES ('22', '24', 'good and gbc');
INSERT INTO `t_que_answer` VALUES ('23', '10', 'HashSet集成字AbstractSet');
INSERT INTO `t_que_answer` VALUES ('24', '13', 'InputStreamReader');
INSERT INTO `t_que_answer` VALUES ('25', '21', 'IOException!');
INSERT INTO `t_que_answer` VALUES ('26', '11', 'i为int的最大值');
INSERT INTO `t_que_answer` VALUES ('27', '10', 'LinkedList继承自List');
INSERT INTO `t_que_answer` VALUES ('28', '7', 'MySql');
INSERT INTO `t_que_answer` VALUES ('29', '18', 'new BufferedWriter(new FileInputStream(\"a.dat\"));');
INSERT INTO `t_que_answer` VALUES ('30', '7', 'Oracle');
INSERT INTO `t_que_answer` VALUES ('31', '6', 'pongping');
INSERT INTO `t_que_answer` VALUES ('32', '29', 'public abstract void method(int a);');
INSERT INTO `t_que_answer` VALUES ('33', '25', 'radius');
INSERT INTO `t_que_answer` VALUES ('34', '1', 'run()');
INSERT INTO `t_que_answer` VALUES ('35', '1', 'start()');
INSERT INTO `t_que_answer` VALUES ('36', '20', 'static A\r\nstatic B\r\nI\'m A class\r\nHelloA\r\nI\'m B class\r\nHelloB');
INSERT INTO `t_que_answer` VALUES ('37', '22', '由于String s没有初始化,代码不能通过编译');
INSERT INTO `t_que_answer` VALUES ('38', '2', '继承自Throwable');
INSERT INTO `t_que_answer` VALUES ('39', '15', '调用对象的clone()方法.运用反序列化手段,调用java.io.ObjectInputStream对象的readObject()方法.');
INSERT INTO `t_que_answer` VALUES ('40', '32', '开始的时候,带1000吨上路,走200KM停,放600吨,带剩下的200吨做燃料往回走.重复两次,第三次带着1000吨到达200KM路程时,起点的煤全部转运出来了,此时剩余2000吨,不用返回.然后,再带上1000吨上路,走333KM停,卸下334吨然后返回.第二次过来的时候2000吨都运出来了,不用返回,剩下一共1001吨煤.最后带上1000吨直接走剩下的467KM路程,原地拉下1吨当垃圾了.走完还需要消耗467吨,因此最终剩余533吨煤可以卖.');
INSERT INTO `t_que_answer` VALUES ('44', '34', '1');
INSERT INTO `t_que_answer` VALUES ('45', '35', '1');
INSERT INTO `t_que_answer` VALUES ('46', '36', '1');
INSERT INTO `t_que_answer` VALUES ('47', '37', '1');
INSERT INTO `t_que_answer` VALUES ('48', '38', '4');
INSERT INTO `t_que_answer` VALUES ('49', '39', 'more');
INSERT INTO `t_que_answer` VALUES ('50', '40', 'chmod');
INSERT INTO `t_que_answer` VALUES ('51', '41', 'rw-r--r--');
INSERT INTO `t_que_answer` VALUES ('52', '42', '标准输出重定向到标准错误输出');
INSERT INTO `t_que_answer` VALUES ('53', '43', 'tail');
INSERT INTO `t_que_answer` VALUES ('54', '44', 'a');
INSERT INTO `t_que_answer` VALUES ('55', '45', 'sends SIGTERM to the process whose PID IS 9');
INSERT INTO `t_que_answer` VALUES ('56', '46', 'rm -rf /tmp');
INSERT INTO `t_que_answer` VALUES ('57', '47', 'tar -xzvf filename.tgz');
INSERT INTO `t_que_answer` VALUES ('58', '48', 'ICMP');
INSERT INTO `t_que_answer` VALUES ('59', '49', '在修饰变量的时候,限制变量的作用域,设置变量的存储域（堆,主动分配内存也是堆）:\r\n       A. 在函数体,一个被声明为静态的变量在这一函数被调用过程中维持其值不变\r\n       B. 在模块内（但在函数体外）,一个被声明为静态的变量可以被模块内所用函数访问,但不能被模块外其它函数访问.它是一个本地的全局变量.\r\n在修饰函数的时候, 在模块内,一个被声明为静态的函数只可被这一模块内的其它函数调用.那就是,这个函数被限制在声明它的模块的本地范围内使用.');
INSERT INTO `t_que_answer` VALUES ('60', '50', '使用宏定义.\r\n#define MIN(A,B) ((A)<=(B)?(A):(B))');
INSERT INTO `t_que_answer` VALUES ('61', '51', '10, 12, 120');
INSERT INTO `t_que_answer` VALUES ('62', '52', 'char * strcpy(char *dst,const char *src)   \r\n{\r\n    assert(dst != NULL && src != NULL);    \r\n\r\n    char *address= dst;  \r\n\r\n    while ((*dst++=*src++)!=\'\\0\'); \r\n\r\n    return address;\r\n}');
INSERT INTO `t_que_answer` VALUES ('63', '53', 'void BubbleSort(int *arr,int sz){\r\n    int i = 0;\r\n    int j = 0;\r\n    assert(arr);\r\n    for(i=0;i<sz-1;i++){\r\n        for(j=0;j<sz-i-1;j++){\r\n            if(arr[j]>arr[j+1]){\r\n                int tmp = arr[j];\r\n                arr[j] = arr[j+1];\r\n                arr[j+1] = tmp;\r\n            }\r\n        }\r\n    }\r\n}');
INSERT INTO `t_que_answer` VALUES ('64', '54', '第一步：分为三组，444，取其中两组称，这里会出现两种情况：\r\nA是天平平衡；\r\nB是天平不平衡。\r\n分别讨论如下：\r\n对情况A来说：\r\n第二步：\r\n剩余4个里面有一个是不标准的，抽取其中的三个和标准中的三个来称。\r\n如果不平衡的话可以判断此硬币是轻还是重，此情况为A1；\r\n如果平衡的话剩下的硬币是不标准的，但是不知道轻重，此情况为A2。\r\n第三步：\r\n对A1来说，只需要把三个不平衡的硬币里面任意拿两个来称，如果平衡剩下的硬币自然就是不标准的，而且轻重也知道；\r\n对A2来说，只需要拿个标准的硬币来和这个不标准的称下就知道是轻还是重了。\r\n情况A结束。\r\n\r\n对情况B来说：\r\n首先我们将第一步中的三组分别标记为X，Y，Z组，其中的硬币分别用X1，X2，X3，X4以此类推类表示。\r\n由1可知不标准的硬币在X和Y组中，Z组中全是标准的硬币\r\n第二步：\r\n从X，Y组中分别拿出三个硬币，将Y组的硬币放到X组所在托盘中去，从Z组中拿三个放到Y组所在托盘中去，那么天平X组为Y1，Y2，Y3，X4；Y组为Z1，Z2，Z3，Y4。\r\n这步里天平的变化有三种情况：\r\n第一种是天平不平衡的方向不变，此情况为B1；\r\n第二种是天平变的平衡了，此情况为B2；\r\n第三种是天平不平衡的方向改变了，此情况为B3。\r\n第三步：\r\n对B1来说，说明上面所动的硬币对于天平的平衡没有影响，也就是说只有X4，Y4两个没有变化的硬币中有不标准的硬币的存在，只需要拿其中一个出来和标准的硬币（就取Z4好了）称第三次即可，如果平衡剩下的硬币不标准，由前面的天平方向判断轻重，如果不平衡直接可以判断轻重。\r\n对B2来说，说明X1，X2，X3其中有不标准的，而Y组的全为标准的，结合1可以得出不标准硬币的轻重，接下来只需要从X1，X2，X3中取两个任意称，如果平衡说明剩下一个不标准，如果不平衡根据轻重可以判断出哪个是不标准的。\r\n对B3来说，说明移动的Y1，Y2，Y3对天平的平衡造成了影响，而X组全部是标准的，结合1也同样可以得出不标准硬币的轻重，剩下的事和B2的情况一样，只需要从Y1，Y2，Y3中取两个任意称，如果平衡说明剩下一个不标准，如果不平衡根据轻重可以判断出哪个是不标准的。 \r\n情况B结束。 ');
INSERT INTO `t_que_answer` VALUES ('65', '33', 'public class bnds16{\r\n    public static void main(String[] args) throws IOException{\r\n        int a = (int)(Math.random()*100+50);\r\n        InputStreamReader reader = new InputStreamReader(System.in);\r\n        BuffereReader input = new BuffereReader(reader);\r\n        String s = input.readLine();\r\n        int b = Integer.parseInt(s);\r\n        while(a != b){\r\n            if(a > b){\r\n                System.out.println(\"猜小了!请猜大点\");\r\n            }else{\r\n                System.out.println(\"猜大了!请猜小点\");\r\n            }\r\n            s = input.readLine();\r\n            b = Integer.parseInt(s);\r\n        }\r\n        System.out.println(\"恭喜你,猜对了!是\");\r\n    }\r\n}');

-- ----------------------------
-- Table structure for t_que_bank
-- ----------------------------
DROP TABLE IF EXISTS `t_que_bank`;
CREATE TABLE `t_que_bank` (
  `que_id` int(11) NOT NULL AUTO_INCREMENT,
  `post` varchar(20) DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `qurl` varchar(255) DEFAULT NULL,
  `des` text,
  PRIMARY KEY (`que_id`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_que_bank
-- ----------------------------
INSERT INTO `t_que_bank` VALUES ('1', '2017java', '下面哪些是Thread类的方法', '3', null, '');
INSERT INTO `t_que_bank` VALUES ('2', '2017java', '下面关于java.lang.Exception类的说法正确的是()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('3', '2017java', '下面程序的运行结果是()', '1', null, 'String str1 = \"hello\";\r\nString str2 = \"he\" +new String(\"llo\");\r\nSystem.err.println(str1==str2);');
INSERT INTO `t_que_bank` VALUES ('4', '2017java', '下列说法正确的有()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('5', '2017java', '给定如下java代码,编译运行之后,将会输出()', '0', null, 'public class Test{\r\n    public static void main(String main[]){\r\n        int a = 5;\r\n        System.out.println((a%2==1)?(a+1)/2:a/2);\r\n    }\r\n}');
INSERT INTO `t_que_bank` VALUES ('6', '2017java', '下面程序的运行结果()', '0', null, 'public static void main(String args[]){\r\n    Thread t = new Thread(){\r\n        public void run(){\r\n            pong();\r\n        }\r\n    }\r\n    t.run();\r\n    System.out.println(\"ping\");\r\n}\r\nstatic void pong(){\r\n    System.out.println(\"pong\");\r\n}\r\n');
INSERT INTO `t_que_bank` VALUES ('7', '2017java', '下列属于关系型数据库的是()', '3', null, '');
INSERT INTO `t_que_bank` VALUES ('8', '2017java', 'GC线程是否为守护线程()', '1', null, '');
INSERT INTO `t_que_bank` VALUES ('9', '2017java', 'volatile关键字是否能保证线程安全()', '1', null, '');
INSERT INTO `t_que_bank` VALUES ('10', '2017java', '下列说法正确的是()', '3', null, '');
INSERT INTO `t_que_bank` VALUES ('11', '2017java', '举例说明什么场景下存在使i+1<i的数', '2', null, '');
INSERT INTO `t_que_bank` VALUES ('12', '2017java', '0.6332的数据类型是()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('13', '2017java', '下面哪个流类属于面向字符的输入流()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('14', '2017java', 'Java接口的修饰符可以为()', '3', null, '');
INSERT INTO `t_que_bank` VALUES ('15', '2017java', '不通过构造函数也能创建对象吗?可以请举例', '2', null, '');
INSERT INTO `t_que_bank` VALUES ('16', '2017java', 'ArrayList list = new ArrayList(20)中的list扩充几次()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('17', '2017java', '下面哪些是对称加密算法()', '3', null, '');
INSERT INTO `t_que_bank` VALUES ('18', '2017java', '新建一个流对象,下面哪个选项的代码是错误的()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('19', '2017java', '下面程序能正常运行吗()', '1', null, 'public class NULL{\r\n    public static void haha(){\r\n        System.out.println(\"haha\");\r\n    }\r\n    public static void main(String[] args){\r\n        ((NULL)null).haha();\r\n    }\r\n}');
INSERT INTO `t_que_bank` VALUES ('20', '2017java', '下面程序的运行结果是什么', '2', null, 'class HelloA{\r\n    public HelloA(){\r\n        System.out.println(\"HelloA\");\r\n    }\r\n    {System.out.println(\"I\'m A class\");}\r\n    static {System.out.println(\"static A\");}\r\n}\r\npublic class HelloB extends HelloA{\r\n    public HelloB(){\r\n        System.out.println(\"HelloB\");\r\n    }\r\n    {System.out.println(\"I\'m B class\");}\r\n    static {System.out.println(\"static B\");}\r\n    public static void main(String[] args){\r\n        new HelloB();\r\n    }\r\n}');
INSERT INTO `t_que_bank` VALUES ('21', '2017java', 'getCustomerInfo()方法如下,try中可以捕获三种类型的异常,如果在该方法中产生了一个IOException,将会输出什么结果', '0', null, 'public void getCustomerInfo(){\r\n    try {\r\n    // do something that may cause an Exception\r\n    } catch(java.io.IOException ex){\r\n        System.out.println(\"IOException!\");\r\n    } catch(java.lang.Exception ex){\r\n        System.out.println(\"Exception!\");\r\n    }\r\n}');
INSERT INTO `t_que_bank` VALUES ('22', '2017java', '下面代码的运行结果为()', '0', null, 'import java.io.*;\r\nimport java.util.*;\r\n\r\npublic class foo{\r\n    public static void main(String[] args){\r\n        String s;\r\n        System.out.println(\"s=\"+s);\r\n    }\r\n}');
INSERT INTO `t_que_bank` VALUES ('23', '2017java', 'System.out.println(\"5\"+2)的输出结果应该是()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('24', '2017java', '指出下列程序运行的结果()', '0', null, 'public class Example{\r\n    \r\n    String str = new String(\"good\");\r\n    char[] ch = {\'a\',\'b\',\'c\'};\r\n\r\n    public static void main(String args[]){\r\n        Example ex = new Example();\r\n        ex.change(ex.str,ex.ch);\r\n        System.out.println(ex.str+\"and\");\r\n        System.out.println(ex.ch);\r\n    }\r\n    \r\n    public void change(String str,char[] ch){\r\n        str = \"test ok\";\r\n        ch[0] = \'g\';\r\n    }\r\n}');
INSERT INTO `t_que_bank` VALUES ('25', '2017java', '阅读Shape和Circle两个类的定义.在序列化一个Circle的对象circle到文件时,下面哪个字段会被保存到文件中()', '0', null, 'class Shape{\r\n    public String name;\r\n}\r\nclass Circle extends Shape implements Serializable{\r\n    private float radius;\r\n    transient int color;\r\n    public static String type = \"Circle\";\r\n}');
INSERT INTO `t_que_bank` VALUES ('26', '2017java', '要从文件\"file.dat\"中读出第10个字节到变量c中,下列哪个方法合适()', '3', null, '');
INSERT INTO `t_que_bank` VALUES ('27', '2017java', '下列哪种异常是检查型异常,需要在编写程序时声明()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('28', '2017java', '下面的方法,当输入为2的时候返回值是多少()', '0', null, 'public static int getValue(int t){\r\n    int result = 0;\r\n    switch(i) {\r\n    case 1:\r\n        result = result + i;\r\n    case 2:\r\n        result = result + i * 2;\r\n    case 3:\r\n        result = result + i * 3;\r\n    }\r\n    return result;\r\n}');
INSERT INTO `t_que_bank` VALUES ('29', '2017java', '选项中哪一行代码可以替换题目中//add code here而不产生编译错误()', '0', null, 'public abstract class MyClass {\r\n\r\n     public int constInt = 5;\r\n     //add code here\r\n     public void method() {\r\n     }\r\n}\r\n');
INSERT INTO `t_que_bank` VALUES ('30', '2017java', '下面是People和Child类的定义和构造方法,每个构造方法都输出编号.在执行new Child(\"mike\")的时候都有哪些构造方法被顺序调用?请选择输出结果', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('31', '2017java', '1元钱一瓶汽水,喝完后两个空瓶换一瓶汽水,问:你有20元钱,最多可以喝到几瓶汽水?', '2', null, '');
INSERT INTO `t_que_bank` VALUES ('32', '2017java', '你是山西的一个煤老板,你在矿区开采了有3000吨煤需要运送到市场上去卖,从你的矿区到市场有1000公里,有一列烧煤的火车,这个火车最多只能装1000吨煤,且其每一公里需要耗一吨煤.请问,最多能卖出多少煤?', '2', null, '');
INSERT INTO `t_que_bank` VALUES ('33', '2017java', '设计一个猜数字游戏的java程序.数字为50-150之间的一个整数,由程序随机生成,程序使用者从键盘上输入数据,程序将输入数据与被猜数字进行比较,给程序使用者提示信息(如果输入比生成的小,提示\"猜小了\",否则提示\"猜大了\").当程序使用者输入数值与被猜数字一致时,程序结束. 保存文件名：Bnds16.java ', '2', null, '');
INSERT INTO `t_que_bank` VALUES ('34', '2017java', '智力题-正确选项为()', '0', '034', '每道题包含两套图形和可供选择的4个图形(从左到右依次为ABCD).这两套图形既有某种相似性,也存在某种差异.要求你从四个选项中选择你认为最适合取代问号的一个.正确的答案应不仅使两套图形表现出最大的相似性,而且使第二套图形也表现出自己的特征.');
INSERT INTO `t_que_bank` VALUES ('35', '2017java', '智力题-正确选项为()', '0', '035', '每道题包含两套图形和可供选择的4个图形(从左到右依次为ABCD).这两套图形既有某种相似性,也存在某种差异.要求你从四个选项中选择你认为最适合取代问号的一个.正确的答案应不仅使两套图形表现出最大的相似性,而且使第二套图形也表现出自己的特征.');
INSERT INTO `t_que_bank` VALUES ('36', '2017java', '智力题-正确选项为()', '0', '036', '每道题包含两套图形和可供选择的4个图形(从左到右依次为ABCD).这两套图形既有某种相似性,也存在某种差异.要求你从四个选项中选择你认为最适合取代问号的一个.正确的答案应不仅使两套图形表现出最大的相似性,而且使第二套图形也表现出自己的特征.');
INSERT INTO `t_que_bank` VALUES ('37', '2017java', '智力题-正确选项为()', '0', '037', '每道题包含两套图形和可供选择的4个图形(从左到右依次为ABCD).这两套图形既有某种相似性,也存在某种差异.要求你从四个选项中选择你认为最适合取代问号的一个.正确的答案应不仅使两套图形表现出最大的相似性,而且使第二套图形也表现出自己的特征.');
INSERT INTO `t_que_bank` VALUES ('38', '2017c', '某32位系统下C程序,请计算len的值()', '0', null, 'void Foo(char str[100]){\r\n    int len = sizeof(str);\r\n}');
INSERT INTO `t_que_bank` VALUES ('39', '2017c', '下面哪个Linux命令可以一次显示一页内容()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('40', '2017c', '怎样更改一个文件的权限设置()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('41', '2017c', '如果你的umask设置为022,缺省的你创建的文件的权限为()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('42', '2017c', '在bash中,在一条命令后加入\"1>&2\"意味着()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('43', '2017c', '显示一个文件最后几行的命令是()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('44', '2017c', '在ps命令中什么参数是用来显示所有用户的进程的()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('45', '2017c', '命令kill9的含义是()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('46', '2017c', '如何删除一个非空子目录/tmp()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('47', '2017c', '什么命令解压缩tar文件()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('48', '2017c', 'ping使用的协议是()', '0', null, '');
INSERT INTO `t_que_bank` VALUES ('49', '2017c', '关键字static有什么用途?(请至少说明两种)', '2', null, '');
INSERT INTO `t_que_bank` VALUES ('50', '2017c', '对于一个频繁使用的短小函数,在C语言中应该什么实现?请对以下短小函数进行改写.', '2', null, 'int min(int a, int b){\r\n    if(a <= b){\r\n        return a;\r\n    else\r\n        return b;\r\n    }\r\n}');
INSERT INTO `t_que_bank` VALUES ('51', '2017c', '请写出以下代码的输出内容', '2', null, '#include <stdio.h>\r\n\r\nint main(void){\r\n    int a,b,c,d;\r\n    a = 10;\r\n    b = a++;\r\n    c = ++a;\r\n    d = 10*a++;\r\n    printf(\"b, c, d: %d, %d, %d\", b, c, d);\r\n    return 0;\r\n}');
INSERT INTO `t_que_bank` VALUES ('52', '2017c', '请实现以下C库中函数strcpy的功能', '2', null, '');
INSERT INTO `t_que_bank` VALUES ('53', '2017c', '请实现以下冒泡排序函数,按从小到大排序', '2', null, 'void BubbleSort (int arr[], int sz)');
INSERT INTO `t_que_bank` VALUES ('54', '2017c', '12个硬币有1个假币不知轻重3次天平量出哪个是假币', '2', null, '');

-- ----------------------------
-- Table structure for t_que_options
-- ----------------------------
DROP TABLE IF EXISTS `t_que_options`;
CREATE TABLE `t_que_options` (
  `que_id` int(11) NOT NULL,
  `options` varchar(200) COLLATE utf8_bin NOT NULL,
  `ourl` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`options`,`que_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_que_options
-- ----------------------------
INSERT INTO `t_que_options` VALUES ('41', '----w--w-', null);
INSERT INTO `t_que_options` VALUES ('41', '-w--w----', null);
INSERT INTO `t_que_options` VALUES ('16', '0', null);
INSERT INTO `t_que_options` VALUES ('28', '0', null);
INSERT INTO `t_que_options` VALUES ('5', '1', null);
INSERT INTO `t_que_options` VALUES ('16', '1', null);
INSERT INTO `t_que_options` VALUES ('34', '1', '0341');
INSERT INTO `t_que_options` VALUES ('35', '1', '0351');
INSERT INTO `t_que_options` VALUES ('36', '1', '0361');
INSERT INTO `t_que_options` VALUES ('37', '1', '0371');
INSERT INTO `t_que_options` VALUES ('28', '10', null);
INSERT INTO `t_que_options` VALUES ('38', '100', null);
INSERT INTO `t_que_options` VALUES ('30', '132', null);
INSERT INTO `t_que_options` VALUES ('5', '2', null);
INSERT INTO `t_que_options` VALUES ('16', '2', null);
INSERT INTO `t_que_options` VALUES ('23', '2', null);
INSERT INTO `t_que_options` VALUES ('28', '2', null);
INSERT INTO `t_que_options` VALUES ('34', '2', '0342');
INSERT INTO `t_que_options` VALUES ('35', '2', '0352');
INSERT INTO `t_que_options` VALUES ('36', '2', '0362');
INSERT INTO `t_que_options` VALUES ('37', '2', '0372');
INSERT INTO `t_que_options` VALUES ('38', '2', null);
INSERT INTO `t_que_options` VALUES ('5', '2.5', null);
INSERT INTO `t_que_options` VALUES ('38', '25', null);
INSERT INTO `t_que_options` VALUES ('5', '3', null);
INSERT INTO `t_que_options` VALUES ('16', '3', null);
INSERT INTO `t_que_options` VALUES ('34', '3', '0343');
INSERT INTO `t_que_options` VALUES ('35', '3', '0353');
INSERT INTO `t_que_options` VALUES ('36', '3', '0363');
INSERT INTO `t_que_options` VALUES ('37', '3', '0373');
INSERT INTO `t_que_options` VALUES ('30', '312', null);
INSERT INTO `t_que_options` VALUES ('30', '32', null);
INSERT INTO `t_que_options` VALUES ('28', '4', null);
INSERT INTO `t_que_options` VALUES ('34', '4', '0344');
INSERT INTO `t_que_options` VALUES ('35', '4', '0354');
INSERT INTO `t_que_options` VALUES ('36', '4', '0364');
INSERT INTO `t_que_options` VALUES ('37', '4', '0374');
INSERT INTO `t_que_options` VALUES ('38', '4', null);
INSERT INTO `t_que_options` VALUES ('30', '432', null);
INSERT INTO `t_que_options` VALUES ('23', '5', null);
INSERT INTO `t_que_options` VALUES ('23', '52', null);
INSERT INTO `t_que_options` VALUES ('23', '7', null);
INSERT INTO `t_que_options` VALUES ('17', 'AES', null);
INSERT INTO `t_que_options` VALUES ('10', 'AbstractSet继承自Set', null);
INSERT INTO `t_que_options` VALUES ('13', 'BufferedWriter', null);
INSERT INTO `t_que_options` VALUES ('27', 'ClassCastException', null);
INSERT INTO `t_que_options` VALUES ('17', 'DES', null);
INSERT INTO `t_que_options` VALUES ('17', 'DSA', null);
INSERT INTO `t_que_options` VALUES ('12', 'Double', null);
INSERT INTO `t_que_options` VALUES ('13', 'FileInputStream', null);
INSERT INTO `t_que_options` VALUES ('26', 'FileInputStream in = new FileInputStream(\"file.dat\");in.skip(10);int c = in.read();', null);
INSERT INTO `t_que_options` VALUES ('26', 'FileInputStream in = new FileInputStream(\"file.dat\");in.skip(9);int c = in.read();', null);
INSERT INTO `t_que_options` VALUES ('26', 'FileInputStream in = new FileInputStream(\"file.dat\");in.skip(9);int c = in.readByte();', null);
INSERT INTO `t_que_options` VALUES ('26', 'FileInputStream in = new FileInputStream(\"file.dat\");int c = in.read();', null);
INSERT INTO `t_que_options` VALUES ('27', 'FileNotFoundException', null);
INSERT INTO `t_que_options` VALUES ('21', 'FileNotFoundException!IOExceprion!', null);
INSERT INTO `t_que_options` VALUES ('21', 'FileNotFoundException!IOException!Exception!', null);
INSERT INTO `t_que_options` VALUES ('12', 'Float', null);
INSERT INTO `t_que_options` VALUES ('10', 'HashSet集成字AbstractSet', null);
INSERT INTO `t_que_options` VALUES ('48', 'ICMP', null);
INSERT INTO `t_que_options` VALUES ('7', 'IMS', null);
INSERT INTO `t_que_options` VALUES ('21', 'IOException!', null);
INSERT INTO `t_que_options` VALUES ('21', 'IOException!Exception!', null);
INSERT INTO `t_que_options` VALUES ('27', 'IndexOutOfBoundsException', null);
INSERT INTO `t_que_options` VALUES ('13', 'InputStreamReader', null);
INSERT INTO `t_que_options` VALUES ('10', 'LinkedList继承自List', null);
INSERT INTO `t_que_options` VALUES ('7', 'MongoDb', null);
INSERT INTO `t_que_options` VALUES ('7', 'MySql', null);
INSERT INTO `t_que_options` VALUES ('27', 'NullPointerException', null);
INSERT INTO `t_que_options` VALUES ('13', 'ObjectInputStream', null);
INSERT INTO `t_que_options` VALUES ('7', 'Oracle', null);
INSERT INTO `t_que_options` VALUES ('17', 'RSA', null);
INSERT INTO `t_que_options` VALUES ('48', 'SMB', null);
INSERT INTO `t_que_options` VALUES ('2', 'Serialable', null);
INSERT INTO `t_que_options` VALUES ('48', 'TCP', null);
INSERT INTO `t_que_options` VALUES ('48', 'UDP', null);
INSERT INTO `t_que_options` VALUES ('10', 'WeakMap继承自HashMap', null);
INSERT INTO `t_que_options` VALUES ('44', 'a', null);
INSERT INTO `t_que_options` VALUES ('14', 'abstract', null);
INSERT INTO `t_que_options` VALUES ('40', 'attrib', null);
INSERT INTO `t_que_options` VALUES ('44', 'b', null);
INSERT INTO `t_que_options` VALUES ('39', 'cat', null);
INSERT INTO `t_que_options` VALUES ('40', 'change', null);
INSERT INTO `t_que_options` VALUES ('40', 'chmod', null);
INSERT INTO `t_que_options` VALUES ('4', 'class中的constructor不可省略', null);
INSERT INTO `t_que_options` VALUES ('25', 'color', null);
INSERT INTO `t_que_options` VALUES ('29', 'constInt = constInt + 5;', null);
INSERT INTO `t_que_options` VALUES ('4', 'constructor在一个对象被new时执行', null);
INSERT INTO `t_que_options` VALUES ('4', 'constructor必须与class同名,但方法不能与class同名', null);
INSERT INTO `t_que_options` VALUES ('46', 'del /tmp/*', null);
INSERT INTO `t_que_options` VALUES ('12', 'double', null);
INSERT INTO `t_que_options` VALUES ('1', 'exit()', null);
INSERT INTO `t_que_options` VALUES ('40', 'file', null);
INSERT INTO `t_que_options` VALUES ('14', 'final', null);
INSERT INTO `t_que_options` VALUES ('12', 'float', null);
INSERT INTO `t_que_options` VALUES ('1', 'getPriority()', null);
INSERT INTO `t_que_options` VALUES ('24', 'good and abc', null);
INSERT INTO `t_que_options` VALUES ('24', 'good and gbc', null);
INSERT INTO `t_que_options` VALUES ('39', 'grep', null);
INSERT INTO `t_que_options` VALUES ('45', 'kills all processes belonging to UID 9', null);
INSERT INTO `t_que_options` VALUES ('45', 'kills the process whose PID is 9', null);
INSERT INTO `t_que_options` VALUES ('43', 'last', null);
INSERT INTO `t_que_options` VALUES ('39', 'more', null);
INSERT INTO `t_que_options` VALUES ('25', 'name', null);
INSERT INTO `t_que_options` VALUES ('18', 'new BufferedWriter(new FileInputStream(\"a.dat\"));', null);
INSERT INTO `t_que_options` VALUES ('18', 'new BufferedWriter(new FileWriter(\"a.txt\"));', null);
INSERT INTO `t_que_options` VALUES ('18', 'new GZIPOutputStream(new FileOutputStream(\"a.zip\"));', null);
INSERT INTO `t_que_options` VALUES ('18', 'new ObjectInputStream(new FileInputStream(\"a.dat\"));', null);
INSERT INTO `t_que_options` VALUES ('39', 'pause', null);
INSERT INTO `t_que_options` VALUES ('6', 'pingpong', null);
INSERT INTO `t_que_options` VALUES ('6', 'pingpong和pongping都有可能', null);
INSERT INTO `t_que_options` VALUES ('6', 'pongping', null);
INSERT INTO `t_que_options` VALUES ('14', 'private', null);
INSERT INTO `t_que_options` VALUES ('14', 'protected', null);
INSERT INTO `t_que_options` VALUES ('29', 'public abstract void anotherMethod(){}', null);
INSERT INTO `t_que_options` VALUES ('29', 'public abstract void method(int a);', null);
INSERT INTO `t_que_options` VALUES ('29', 'public int method();', null);
INSERT INTO `t_que_options` VALUES ('41', 'r-xr-x---', null);
INSERT INTO `t_que_options` VALUES ('25', 'radius', null);
INSERT INTO `t_que_options` VALUES ('43', 'rear', null);
INSERT INTO `t_que_options` VALUES ('46', 'rm -Ra /tmp/*', null);
INSERT INTO `t_que_options` VALUES ('46', 'rm -rf /tmp', null);
INSERT INTO `t_que_options` VALUES ('46', 'rm -rf /tmp/*', null);
INSERT INTO `t_que_options` VALUES ('1', 'run()', null);
INSERT INTO `t_que_options` VALUES ('41', 'rw-r--r--', null);
INSERT INTO `t_que_options` VALUES ('45', 'sends SIGKILL to the process whose PID is 9', null);
INSERT INTO `t_que_options` VALUES ('45', 'sends SIGTERM to the process whose PID IS 9', null);
INSERT INTO `t_que_options` VALUES ('1', 'start()', null);
INSERT INTO `t_que_options` VALUES ('43', 'tac', null);
INSERT INTO `t_que_options` VALUES ('43', 'tail', null);
INSERT INTO `t_que_options` VALUES ('47', 'tar -czvf filename.tgz', null);
INSERT INTO `t_que_options` VALUES ('47', 'tar -dzvf filename.tgz', null);
INSERT INTO `t_que_options` VALUES ('47', 'tar -tzvf filename.tgz', null);
INSERT INTO `t_que_options` VALUES ('47', 'tar -xzvf filename.tgz', null);
INSERT INTO `t_que_options` VALUES ('24', 'test ok and abc', null);
INSERT INTO `t_que_options` VALUES ('24', 'test ok and gbc', null);
INSERT INTO `t_que_options` VALUES ('25', 'type', null);
INSERT INTO `t_que_options` VALUES ('44', 'u', null);
INSERT INTO `t_que_options` VALUES ('44', 'x', null);
INSERT INTO `t_que_options` VALUES ('4', '一个class只能定义一个constructor', null);
INSERT INTO `t_que_options` VALUES ('2', '不记得，反正不正确', null);
INSERT INTO `t_que_options` VALUES ('22', '代码得到编译,但捕获到NullPointException异常', null);
INSERT INTO `t_que_options` VALUES ('22', '代码得到编译,并输出\"s=\"', null);
INSERT INTO `t_que_options` VALUES ('22', '代码得到编译,并输出\"s=null\"', null);
INSERT INTO `t_que_options` VALUES ('42', '标准输入重定向到标准错误输出', null);
INSERT INTO `t_que_options` VALUES ('42', '标准输出重定向到标准输入', null);
INSERT INTO `t_que_options` VALUES ('42', '标准输出重定向到标准错误输出', null);
INSERT INTO `t_que_options` VALUES ('42', '标准错误输出重定向到标准输入', null);
INSERT INTO `t_que_options` VALUES ('22', '由于String s没有初始化,代码不能通过编译', null);
INSERT INTO `t_que_options` VALUES ('2', '继承自Error', null);
INSERT INTO `t_que_options` VALUES ('2', '继承自Throwable', null);
INSERT INTO `t_que_options` VALUES ('6', '都不输出', null);

-- ----------------------------
-- Table structure for t_user_exa
-- ----------------------------
DROP TABLE IF EXISTS `t_user_exa`;
CREATE TABLE `t_user_exa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `que_id` int(11) NOT NULL,
  `temp_id` int(11) NOT NULL,
  `type` int(11) NOT NULL,
  `user_answer` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `user_flag` varchar(10) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_user_exa
-- ----------------------------
INSERT INTO `t_user_exa` VALUES ('1', '38', '2', '0', '4', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('2', '39', '2', '0', 'more', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('3', '40', '2', '0', 'chmod', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('4', '41', '2', '0', 'rw-r--r--', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('5', '42', '2', '0', '标准输出重定向到标准错误输出', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('6', '43', '2', '0', 'tail', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('7', '44', '2', '0', 'a', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('8', '45', '2', '0', 'sends SIGTERM to the process whose PID IS 9', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('9', '46', '2', '0', 'rm -rf /tmp', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('10', '47', '2', '0', 'tar -xzvf filename.tgz', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('11', '48', '2', '0', 'ICMP', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('12', '49', '2', '2', 'A\r\nB', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('13', '50', '2', '2', '宏定义', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('14', '51', '2', '2', '', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('15', '52', '2', '2', '', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('16', '53', '2', '2', '', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('17', '54', '2', '2', '', 'a5fcacbf-d');
INSERT INTO `t_user_exa` VALUES ('18', '2', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('19', '4', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('20', '5', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('21', '6', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('22', '12', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('23', '13', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('24', '16', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('25', '18', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('26', '21', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('27', '22', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('28', '23', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('29', '24', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('30', '25', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('31', '27', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('32', '28', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('33', '29', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('34', '30', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('35', '34', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('36', '35', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('37', '36', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('38', '37', '1', '0', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('39', '3', '1', '1', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('40', '8', '1', '1', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('41', '9', '1', '1', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('42', '19', '1', '1', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('43', '11', '1', '2', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('44', '15', '1', '2', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('45', '20', '1', '2', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('46', '31', '1', '2', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('47', '32', '1', '2', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('48', '33', '1', '2', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('49', '1', '1', '3', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('50', '7', '1', '3', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('51', '10', '1', '3', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('52', '14', '1', '3', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('53', '17', '1', '3', '', '6578f060-e');
INSERT INTO `t_user_exa` VALUES ('54', '26', '1', '3', '', '6578f060-e');

-- ----------------------------
-- Table structure for t_user_info
-- ----------------------------
DROP TABLE IF EXISTS `t_user_info`;
CREATE TABLE `t_user_info` (
  `user_flag` varchar(10) COLLATE utf8_bin NOT NULL,
  `email` varchar(30) COLLATE utf8_bin NOT NULL,
  `major` varchar(30) COLLATE utf8_bin NOT NULL,
  `name` varchar(10) COLLATE utf8_bin NOT NULL,
  `phone` varchar(11) COLLATE utf8_bin NOT NULL,
  `post` varchar(10) COLLATE utf8_bin NOT NULL,
  `school` varchar(30) COLLATE utf8_bin NOT NULL,
  `judge_sum_score` int(11) DEFAULT NULL,
  `choice_sum_score` int(11) DEFAULT NULL,
  `choices_sum_score` int(11) DEFAULT NULL,
  `do_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_flag`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_user_info
-- ----------------------------
INSERT INTO `t_user_info` VALUES ('6578f060-e', '@qq.com', 'java', 'testName', '123456', '2017java', 'zzu', '0', '0', '0', '2017-11-15 18:15:35');
INSERT INTO `t_user_info` VALUES ('a5fcacbf-d', '123456@qq.com', 'c++', 'testName', '1234567', '2017c', 'zzu', '0', '22', '0', '2017-11-15 18:13:36');
