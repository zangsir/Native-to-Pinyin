# Native-to-Pinyin NetBeans Projects

This project contains an i/o bug and is mainly used as reference source code. If you want to use the command line tool to convert Chinese characters to pinyin, use n2p.jar at the root directory.

Java utility to convert a text file of Chinese characters into a pinyin form with tone marks in the end of each syllable. 

(using library pinyin4j:   http://pinyin4j.sourceforge.net/)

currently the pinyin will go to standard out as a quick demo.

If you don't want to modify the source code, you can use shell scripting to redirect to a text file, or do batch processing.

<b>There are two versions/subdirectories in this repository: </b>

1.File mode (<b>InputExp/</b>) 

2.UserInput mode (<b>pinyin-exp/</b>) (see readme of in the NetbeanProjects/ directory).

<br>
<b>Example Usage of the <i>File</i> (version 1) mode: </b>
<br>
you can use the n2p.jar file directly with a command line argument (which is the text file consisting of Chinese character texts).

On Unix shell, in the directory that contains this jar file and a text file, for example, do:
```

$java -jar ConversionN2p.jar lyrics.txt
```
both of these files (jar and txt) can be found in the InputExp/store directory.

<b>Note</b>: Chinese characters  do not necessarily have one-to-one mapping to pinyin, i.e., in many cases, one character maps to several different pinyin forms (pronunciations). pinyin4j library gives the multiple pinyin output as a Java String array. In most cases the first one is the most frequent one, so the current implementation only gives the first one as the output for simplicity. (To fully use the multiple pronunciation feature of pinyin4j one needs to go beyond unigram language model and use a bi- or tri-gram model (the unit being a character / syllable). 