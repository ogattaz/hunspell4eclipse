# New version out: 0.8.7
mai 28 2012.

Plug-in "com.lorands.hunspell4eclipse.hunspelljna"
* 1.1.17.qualifier 
* adopts JNA 3.4.0

Feature "com.lorands.hunspell4eclipse.feature" 
* 0.8.7.qualifier 
* remove the dependency to "jdt.ui" 
* re-compute the dependencies of the the feature : break the dependency to the JDT

# New version out: 0.8.6
july 11 2011.

Feature "com.lorands.hunspell4eclipse.feature" 
* 0.8.6.qualifier * Corrects one english typo 
* Adds Hungarian and Serbian message properties 
* Corrects the toc and the "howto trace" page of the embedded html documentation.

Plug-in "com.lorands.hunspell4eclipse" 
* 0.8.6.qualifier 
* Updates and enhances the help documentation 
* Adds windows 64 bits support (hunspell-win-x86-64.dll). 
* Suppresses the dependancy to the jdt packages. 
* Corrects the dependencies to the IBM ICU packages 
* Adds i18n support (english, french) 
* Renames classes 
* Improves the SpellingEngineImpl to select the better english dictionary if needed. The prefered order is : en_US,en_GB,en_... 
* Adds copyright header in the sources 
* sets the svn property "svn:mime-type" to the value "text/html" for all the pages of the help documentation_

Plug-in "com.lorands.hunspell4eclipse.hunspelljna" 
* 1.1.16.qualifier

Feature "com.lorands.hunspell4eclipse.javaSpell.feature" 
* 0.8.6.qualifier * NEW feature 
* Adds a specific feature for the availability of the hunspell spelling service in the java editor. This allows to break the dependancies to the jdt packages.

Plug-in "com.lorands.hunspell4eclipse.javaSpell" 
* 0.8.6.qualifier * Changes the super class of JavaHunspellEngine due to the rename of the class "com.lorands.hunspell4eclipse.HunspellEngineBase"

Feature "com.lorands.hunspell4eclipse.RestSpell.feature" 
* 0.8.6.qualifier * NEW feature

Plug-in "com.lorands.hunspell4eclipse.RestSpell" 
* 0.8.6.qualifier * NEW plug-in which propose and specialized spelling engine for the RestEditor. This spelling engine doesn't check all the key words of the directives of Sphinx or reStructuredText

# New version out: 0.8.5
june 08 2011.

Feature "com.lorands.hunspell4eclipse.feature" 
* 0.8.5.qualifier

Plug-in "com.lorands.hunspell4eclipse" 
* 0.8.5.qualifier 
* Accepts english words in texts. 
* Adds a new preference flag 
* Adds checks in the preferences panel 
* Adopts the same architecture as that used by the JDT, using a CheckIterator based on the the IBM ICU BreakIterator. The CheckIterator enhances the BreakIterator to be able to distinguish the urls or the html tags, or the html entities. 
* Adds a test app and a file to validate the new HunspellCheckIterator class 
* Updates and enhances the help documentation. The documentation pages embeded in the plug-in are also available on the air : http://hunspell4eclipse.googlecode.com/svn/trunk/com.lorands.hunspell4eclipse/html/help.html

Plug-in "com.lorands.hunspell4eclipse.javaSpell" 
* 0.7.3.qualifier 
* Campaign of renaming. Starts the name of all the classes with the prefix "JavaHunspell" 
* Adds the class "JavaHunspellingProblem" to specialize the class "HunspellingProblem", to be able to deliver some "WordCorrectionProposals" in the response of the method "getProposals()". This allows the the jdt quickfixprocessor to add the proposals at the right place in the list of quickfix

Plug-in "com.lorands.hunspell4eclipse.hunspelljna" 
* 1.1.15.qualifier * Cleans the cache of dictionnaries when the plug-in is stoped 
* Adds the url of the web site of Flemming in the "readme" file 
* Corrects some methods of the CTools class * Adds capabilities in the CPaltform class 
* Renames the class of the test application

# New version out: 0.8.4
mai 16 2011.

Feature "com.lorands.hunspell4eclipse.feature" 
* 0.8.4.qualifier

Plug-in "com.lorands.hunspell4eclipse" 
* 0.8.4.qualifier 
* Renames the activator * Adds a new preference parameter to limit the number of proposal 
* Enhances the abstract spell engine to be able to implement specific text splitter in each sub-classe. 
* Enhances the help pages.

Plug-in "com.lorands.hunspell4eclipse.javaSpell" 
* 0.7.2.qualifier * Renames the activator 
* Reuses the javadoc text splitter of the jdt plugin 
* Adds a QuickFixProcessor which returns a list of word correction proposals using the hunspell spelling engine

Plug-in "com.lorands.hunspell4eclipse.hunspelljna" 
* 1.1.14.qualifier 
* Renames the activator 
* Enhances and corrects internal tools (see classes CTools and CLog).

# New version out: 0.8.3
mai 11 2011.

Just released the beta version: 0.8.3

The update site remains the same. (http://hunspell4eclipse.googlecode.com/svn/trunk/com.lorands.hunspell4eclipse.updatesite)

Includes the library JNA 3.2.7 (plug-in validated on Mac Os X1.6.7 64bits, Windows XP SP3 32bits and Ubuntu 10.04 LTS 64bits)
Corrects a bug in the method which build the native library name
Corrects the implementation of the rule "WWMixedCaseIgnored"
Corrects the error which appears when the JDT editor try to instantiate the class associated to the extension point the "javaCompletionProposalComputer"
Changes the splitting method to use a BreakIterator
New version out: 0.8.2
Jan 16 2010.

# New version out: 0.8.2

Just released a new beta version: 0.8.2

Update site back to normal. (http://hunspell4eclipse.googlecode.com/svn/trunk/com.lorands.hunspell4eclipse.updatesite)
