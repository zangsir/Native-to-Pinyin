# Native-to-Pinyin

Java utility to convert a text file of Chinese characters into a pinyin form with tone marks in the end of each syllable. 

(using library pinyin4j)

currently the pinyin will go to standard out as a quick demo.

If you don't want to modify the source code, you can use shell scripting to redirect to a text file, or do batch processing.

Usage: 
you can use the ConversionN2p.jar file directly with a command line argument (which is the text file containing the Chinese charadters).

On the directory that contains this jar file and a text file, for example, do:
java -jar ConversionN2p.jar ./lyrics.txt