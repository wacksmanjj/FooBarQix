package com.valtech.foobarqix.engine;

public class DigitProcessor {
	private static final Integer[] ZERO_TO_NINE = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; 
	private int digit;
	private String name;
	
	private String[][] match;
	private String[] mult;
	
	public DigitProcessor(int digit, String name) {
		this.digit = digit;
		this.name = name;
		match = new String[ZERO_TO_NINE.length][ZERO_TO_NINE.length];
		mult = new String[ZERO_TO_NINE.length*ZERO_TO_NINE.length];
		init();
	}
	
	private void init() {
		{
{
final Integer [ ] array4 = ZERO_TO_NINE; final int blockcount4 = java . lang . Runtime .getRuntime ().availableProcessors (); {final java . util . List < apx . lang . gen . Branch > branches7 =new java . util . ArrayList < apx . lang . gen . Branch > ();
final apx . lang . gen . Parallel parallelBlock7 =apx . lang . gen . Parallel .getParallelBlock ();
{
final apx . util . RangeInteger range9 = new apx . util . RangeInteger (0 , ((blockcount4 )- 1 ));
final int last9 = (range9 ). max ;
for(int block9 = (range9 ). min ;block9 <= last9 ;block9 ++ )
{
final int nbBlock4 = block9 ;
{
{
apx . lang . gen . Branch branch11 = new apx . lang . gen . Branch (){
public @java . lang .Override void run () throws java . lang . Throwable {
{
final apx . util . RangeInteger range10 = new apx . util . RangeInteger ((((new apx . util . RangeInteger ((0 ), ((array4 . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array4 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array4 . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array4 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array4 . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* (nbBlock4 )), (java . lang . Math . min (((new apx . util . RangeInteger ((0 ), ((array4 . length )- 1 ))). max ), ((new apx . util . RangeInteger ((0 ), ((array4 . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array4 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array4 . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array4 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array4 . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* ((nbBlock4 )+ 1 )- 1 )));
final int last10 = (range10 ). max ;
for(int block10 = (range10 ). min ;block10 <= last10 ;block10 ++ )
{
final int arrayIndex4 = block10 ;
{
{final Integer i = array4 [ arrayIndex4 ] ;{
{
			{
{
			 	final java . util . List < apx . lang . gen . Branch > branches6 =new java . util . ArrayList < apx . lang . gen . Branch > ();
final apx . lang . gen . Parallel parallelBlock6 =apx . lang . gen . Parallel .getParallelBlock ();
{
apx . lang . gen . Branch branch8 = new apx . lang . gen . Branch (){
public @java . lang .Override void run () throws java . lang . Throwable {
DigitProcessor .this.match[i][DigitProcessor .this.digit] = DigitProcessor .this.name;
			 	}
}
;
branches6 .add (branch8 );
}
{
apx . lang . gen . Branch branch9 = new apx . lang . gen . Branch (){
public @java . lang .Override void run () throws java . lang . Throwable {
DigitProcessor .this.match[DigitProcessor .this.digit][i] = DigitProcessor .this.name;
			 	
			 	}
}
;
branches6 .add (branch9 );
}
{
apx . lang . gen . Branch branch10 = new apx . lang . gen . Branch (){
public @java . lang .Override void run () throws java . lang . Throwable {
{
{
final Integer [ ] array5 = com . valtech . foobarqix . engine . DigitProcessor .ZERO_TO_NINE; final int blockcount5 = java . lang . Runtime .getRuntime ().availableProcessors (); {final java . util . List < apx . lang . gen . Branch > branches5 =new java . util . ArrayList < apx . lang . gen . Branch > ();
final apx . lang . gen . Parallel parallelBlock5 =apx . lang . gen . Parallel .getParallelBlock ();
{
final apx . util . RangeInteger range11 = new apx . util . RangeInteger (0 , ((blockcount5 )- 1 ));
final int last11 = (range11 ). max ;
for(int block11 = (range11 ). min ;block11 <= last11 ;block11 ++ )
{
final int nbBlock5 = block11 ;
{
{
apx . lang . gen . Branch branch7 = new apx . lang . gen . Branch (){
public @java . lang .Override void run () throws java . lang . Throwable {
{
final apx . util . RangeInteger range12 = new apx . util . RangeInteger ((((new apx . util . RangeInteger ((0 ), ((array5 . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array5 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array5 . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array5 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array5 . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* (nbBlock5 )), (java . lang . Math . min (((new apx . util . RangeInteger ((0 ), ((array5 . length )- 1 ))). max ), ((new apx . util . RangeInteger ((0 ), ((array5 . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array5 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array5 . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array5 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array5 . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* ((nbBlock5 )+ 1 )- 1 )));
final int last12 = (range12 ). max ;
for(int block12 = (range12 ). min ;block12 <= last12 ;block12 ++ )
{
final int arrayIndex5 = block12 ;
{
{final Integer j = array5 [ arrayIndex5 ] ;{
{
			 		int number = ((j*10)+i)*DigitProcessor .this.digit-1;
			 		if(number > 0 && number <100) {
			 			DigitProcessor .this.mult[number] = DigitProcessor .this.name;
			 		}
			 	}
			}
}}
}
}
}
}
;
branches5 .add (branch7 );
}
}
}
}
final apx . lang . gen . ExitStatus exitStatus5 =parallelBlock5 . run (branches5 );
if(exitStatus5 .hasReturned ()) {
throw new apx . lang . gen . ReturnException ();
} {
final Throwable throwable5 =exitStatus5 .thrownException ();
if(throwable5 !=null) {
if(throwable5 instanceof RuntimeException ) throw (RuntimeException )throwable5 ;
if(throwable5 instanceof Error ) throw (Error )throwable5 ;
}
}
} }
}
}
}
;
branches6 .add (branch10 );
}
final apx . lang . gen . ExitStatus exitStatus6 =parallelBlock6 . run (branches6 );
if(exitStatus6 .hasReturned ()) {
throw new apx . lang . gen . ReturnException ();
} {
final Throwable throwable6 =exitStatus6 .thrownException ();
if(throwable6 !=null) {
if(throwable6 instanceof RuntimeException ) throw (RuntimeException )throwable6 ;
if(throwable6 instanceof Error ) throw (Error )throwable6 ;
}
}
}
		}
}
		}
}}
}
}
}
}
;
branches7 .add (branch11 );
}
}
}
}
final apx . lang . gen . ExitStatus exitStatus7 =parallelBlock7 . run (branches7 );
if(exitStatus7 .hasReturned ()) {
return ;
} {
final Throwable throwable7 =exitStatus7 .thrownException ();
if(throwable7 !=null) {
if(throwable7 instanceof RuntimeException ) throw (RuntimeException )throwable7 ;
if(throwable7 instanceof Error ) throw (Error )throwable7 ;
}
}
} }
}
match[digit][digit] += name;
	}

	public String getMatch(int number) {
		if(number == 100) {
			return null;
		}
		return match[number/10][number%10];
	}

	public String getMult(int number) {
		return mult[number-1];
	}

}
