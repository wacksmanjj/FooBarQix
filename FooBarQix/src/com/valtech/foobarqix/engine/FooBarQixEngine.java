package com.valtech.foobarqix.engine;

import java.util.List;

import com.vaadin.data.util.ObjectProperty;

public class FooBarQixEngine {

	private DigitProcessor[] processors;
	
	public FooBarQixEngine() {
		processors = new DigitProcessor[3];
		{
{
		 	final java . util . List < apx . lang . gen . Branch > branches =new java . util . ArrayList < apx . lang . gen . Branch > ();
final apx . lang . gen . Parallel parallelBlock =apx . lang . gen . Parallel .getParallelBlock ();
{
apx . lang . gen . Branch branch = new apx . lang . gen . Branch (){
public @java . lang .Override void run () throws java . lang . Throwable {
FooBarQixEngine .this.processors[0] = new DigitProcessor(3, "Foo");
		 	}
}
;
branches .add (branch );
}
{
apx . lang . gen . Branch branch0 = new apx . lang . gen . Branch (){
public @java . lang .Override void run () throws java . lang . Throwable {
FooBarQixEngine .this.processors[1] = new DigitProcessor(5, "Bar");
		 	}
}
;
branches .add (branch0 );
}
{
apx . lang . gen . Branch branch1 = new apx . lang . gen . Branch (){
public @java . lang .Override void run () throws java . lang . Throwable {
FooBarQixEngine .this.processors[2] = new DigitProcessor(7, "Qix");
		}
}
;
branches .add (branch1 );
}
final apx . lang . gen . ExitStatus exitStatus =parallelBlock . run (branches );
if(exitStatus .hasReturned ()) {
return ;
} {
final Throwable throwable =exitStatus .thrownException ();
if(throwable !=null) {
if(throwable instanceof RuntimeException ) throw (RuntimeException )throwable ;
if(throwable instanceof Error ) throw (Error )throwable ;
}
}
}
	}
}
	
	public String getValue(int number) {
		String value = null;
		
		for ( DigitProcessor processor : processors) {
{
			value = concat(value, processor.getMult(number));
		}
		
		}
for ( DigitProcessor processor : processors) {
{
			value = concat(value, processor.getMatch(number));
		}
		
		}
return value==null?Integer.toString(number):value;
	}
	
	private String concat(String s1, String s2) {
		if(s1 == null) {
			return s2;
		}
		if(s2 == null) {
			return s1;
		}
		return s1 + s2;
	}
	
	public String compute(List<ObjectProperty<String>> properties) {
		Object[] initialValues = properties.toArray();
		
		{
final java . util . List < com . vaadin . data . util . ObjectProperty < String > > properties0 = properties ;
{
final Object [ ] array = initialValues; final int blockcount = java . lang . Runtime .getRuntime ().availableProcessors (); {final java . util . List < apx . lang . gen . Branch > branches0 =new java . util . ArrayList < apx . lang . gen . Branch > ();
final apx . lang . gen . Parallel parallelBlock0 =apx . lang . gen . Parallel .getParallelBlock ();
{
final apx . util . RangeInteger range = new apx . util . RangeInteger (0 , ((blockcount )- 1 ));
final int last = (range ). max ;
for(int block = (range ). min ;block <= last ;block ++ )
{
final int nbBlock = block ;
{
{
apx . lang . gen . Branch branch2 = new apx . lang . gen . Branch (){
public @java . lang .Override void run () throws java . lang . Throwable {
{
final apx . util . RangeInteger range0 = new apx . util . RangeInteger ((((new apx . util . RangeInteger ((0 ), ((array . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* (nbBlock )), (java . lang . Math . min (((new apx . util . RangeInteger ((0 ), ((array . length )- 1 ))). max ), ((new apx . util . RangeInteger ((0 ), ((array . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* ((nbBlock )+ 1 )- 1 )));
final int last0 = (range0 ). max ;
for(int block0 = (range0 ). min ;block0 <= last0 ;block0 ++ )
{
final int arrayIndex = block0 ;
{
{final Object value = array [ arrayIndex ] ;{
{
			int index = properties0.indexOf(value);
			properties0.get(index).setValue(FooBarQixEngine .this.getValue(index+1));
		}
		
		}
}}
}
}
}
}
;
branches0 .add (branch2 );
}
}
}
}
final apx . lang . gen . ExitStatus exitStatus0 =parallelBlock0 . run (branches0 );
if(exitStatus0 .hasReturned ()) {
return exitStatus0 .<String >returnedValue ();
} {
final Throwable throwable0 =exitStatus0 .thrownException ();
if(throwable0 !=null) {
if(throwable0 instanceof RuntimeException ) throw (RuntimeException )throwable0 ;
if(throwable0 instanceof Error ) throw (Error )throwable0 ;
}
}
} }
}
return "";
	}
	
	public String[] compute(Integer[] numbers) {
		String[] result = new String[numbers.length];
		
		{
final String [ ] result0 = result ;
final Integer [ ] numbers0 = numbers ;
{
final Integer [ ] array0 = numbers0; final int blockcount0 = java . lang . Runtime .getRuntime ().availableProcessors (); {final java . util . List < apx . lang . gen . Branch > branches2 =new java . util . ArrayList < apx . lang . gen . Branch > ();
final apx . lang . gen . Parallel parallelBlock2 =apx . lang . gen . Parallel .getParallelBlock ();
{
final apx . util . RangeInteger range1 = new apx . util . RangeInteger (0 , ((blockcount0 )- 1 ));
final int last1 = (range1 ). max ;
for(int block1 = (range1 ). min ;block1 <= last1 ;block1 ++ )
{
final int nbBlock0 = block1 ;
{
{
apx . lang . gen . Branch branch4 = new apx . lang . gen . Branch (){
public @java . lang .Override void run () throws java . lang . Throwable {
{
final apx . util . RangeInteger range2 = new apx . util . RangeInteger ((((new apx . util . RangeInteger ((0 ), ((array0 . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array0 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array0 . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array0 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array0 . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* (nbBlock0 )), (java . lang . Math . min (((new apx . util . RangeInteger ((0 ), ((array0 . length )- 1 ))). max ), ((new apx . util . RangeInteger ((0 ), ((array0 . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array0 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array0 . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array0 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array0 . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* ((nbBlock0 )+ 1 )- 1 )));
final int last2 = (range2 ). max ;
for(int block2 = (range2 ). min ;block2 <= last2 ;block2 ++ )
{
final int arrayIndex0 = block2 ;
{
{Integer i = array0 [ arrayIndex0 ] ;{
{
			{
final String [ ] result1 = result0 ;
final Integer [ ] numbers1 = numbers0 ;
{
final Integer [ ] array1 = numbers1; final int blockcount1 = java . lang . Runtime .getRuntime ().availableProcessors (); {final java . util . List < apx . lang . gen . Branch > branches1 =new java . util . ArrayList < apx . lang . gen . Branch > ();
final apx . lang . gen . Parallel parallelBlock1 =apx . lang . gen . Parallel .getParallelBlock ();
{
final apx . util . RangeInteger range3 = new apx . util . RangeInteger (0 , ((blockcount1 )- 1 ));
final int last3 = (range3 ). max ;
for(int block3 = (range3 ). min ;block3 <= last3 ;block3 ++ )
{
final int nbBlock1 = block3 ;
{
{
apx . lang . gen . Branch branch3 = new apx . lang . gen . Branch (){
public @java . lang .Override void run () throws java . lang . Throwable {
{
final apx . util . RangeInteger range4 = new apx . util . RangeInteger ((((new apx . util . RangeInteger ((0 ), ((array1 . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array1 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array1 . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array1 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array1 . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* (nbBlock1 )), (java . lang . Math . min (((new apx . util . RangeInteger ((0 ), ((array1 . length )- 1 ))). max ), ((new apx . util . RangeInteger ((0 ), ((array1 . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array1 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array1 . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array1 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array1 . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* ((nbBlock1 )+ 1 )- 1 )));
final int last4 = (range4 ). max ;
for(int block4 = (range4 ). min ;block4 <= last4 ;block4 ++ )
{
final int arrayIndex1 = block4 ;
{
{final Integer number = array1 [ arrayIndex1 ] ;{
{
				result1[number] = FooBarQixEngine .this.getValue(number+1);
			}
		}
}}
}
}
}
}
;
branches1 .add (branch3 );
}
}
}
}
final apx . lang . gen . ExitStatus exitStatus1 =parallelBlock1 . run (branches1 );
if(exitStatus1 .hasReturned ()) {
throw new apx . lang . gen . ReturnException (exitStatus1 .<String [ ] >returnedValue ());
} {
final Throwable throwable1 =exitStatus1 .thrownException ();
if(throwable1 !=null) {
if(throwable1 instanceof RuntimeException ) throw (RuntimeException )throwable1 ;
if(throwable1 instanceof Error ) throw (Error )throwable1 ;
}
}
} }
}
}
		
		}
}}
}
}
}
}
;
branches2 .add (branch4 );
}
}
}
}
final apx . lang . gen . ExitStatus exitStatus2 =parallelBlock2 . run (branches2 );
if(exitStatus2 .hasReturned ()) {
return exitStatus2 .<String [ ] >returnedValue ();
} {
final Throwable throwable2 =exitStatus2 .thrownException ();
if(throwable2 !=null) {
if(throwable2 instanceof RuntimeException ) throw (RuntimeException )throwable2 ;
if(throwable2 instanceof Error ) throw (Error )throwable2 ;
}
}
} }
}
return result;
	}
	
	public static String[] computeSimpleParallel(Integer[] numbers) {
		String[] result = new String[numbers.length];
		
		{
final String [ ] result2 = result ;
final Integer [ ] numbers2 = numbers ;
{
final Integer [ ] array2 = numbers2; final int blockcount2 = java . lang . Runtime .getRuntime ().availableProcessors (); {final java . util . List < apx . lang . gen . Branch > branches4 =new java . util . ArrayList < apx . lang . gen . Branch > ();
final apx . lang . gen . Parallel parallelBlock4 =apx . lang . gen . Parallel .getParallelBlock ();
{
final apx . util . RangeInteger range5 = new apx . util . RangeInteger (0 , ((blockcount2 )- 1 ));
final int last5 = (range5 ). max ;
for(int block5 = (range5 ). min ;block5 <= last5 ;block5 ++ )
{
final int nbBlock2 = block5 ;
{
{
apx . lang . gen . Branch branch6 = new apx . lang . gen . Branch (){
public @java . lang .Override void run () throws java . lang . Throwable {
{
final apx . util . RangeInteger range6 = new apx . util . RangeInteger ((((new apx . util . RangeInteger ((0 ), ((array2 . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array2 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array2 . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array2 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array2 . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* (nbBlock2 )), (java . lang . Math . min (((new apx . util . RangeInteger ((0 ), ((array2 . length )- 1 ))). max ), ((new apx . util . RangeInteger ((0 ), ((array2 . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array2 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array2 . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array2 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array2 . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* ((nbBlock2 )+ 1 )- 1 )));
final int last6 = (range6 ). max ;
for(int block6 = (range6 ). min ;block6 <= last6 ;block6 ++ )
{
final int arrayIndex2 = block6 ;
{
{Integer i = array2 [ arrayIndex2 ] ;{
{
			{
final String [ ] result3 = result2 ;
final Integer [ ] numbers3 = numbers2 ;
{
final Integer [ ] array3 = numbers3; final int blockcount3 = java . lang . Runtime .getRuntime ().availableProcessors (); {final java . util . List < apx . lang . gen . Branch > branches3 =new java . util . ArrayList < apx . lang . gen . Branch > ();
final apx . lang . gen . Parallel parallelBlock3 =apx . lang . gen . Parallel .getParallelBlock ();
{
final apx . util . RangeInteger range7 = new apx . util . RangeInteger (0 , ((blockcount3 )- 1 ));
final int last7 = (range7 ). max ;
for(int block7 = (range7 ). min ;block7 <= last7 ;block7 ++ )
{
final int nbBlock3 = block7 ;
{
{
apx . lang . gen . Branch branch5 = new apx . lang . gen . Branch (){
public @java . lang .Override void run () throws java . lang . Throwable {
{
final apx . util . RangeInteger range8 = new apx . util . RangeInteger ((((new apx . util . RangeInteger ((0 ), ((array3 . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array3 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array3 . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array3 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array3 . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* (nbBlock3 )), (java . lang . Math . min (((new apx . util . RangeInteger ((0 ), ((array3 . length )- 1 ))). max ), ((new apx . util . RangeInteger ((0 ), ((array3 . length )- 1 ))). min )+ ((((new apx . util . RangeInteger ((0 ), ((array3 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array3 . length )- 1 ))). min )+ 1 )/ (java . lang . Runtime .getRuntime ().availableProcessors ())+ ((((new apx . util . RangeInteger ((0 ), ((array3 . length )- 1 ))). max )- ((new apx . util . RangeInteger ((0 ), ((array3 . length )- 1 ))). min )+ 1 )% (java . lang . Runtime .getRuntime ().availableProcessors ())== 0 ? 0 : 1 ))* ((nbBlock3 )+ 1 )- 1 )));
final int last8 = (range8 ). max ;
for(int block8 = (range8 ). min ;block8 <= last8 ;block8 ++ )
{
final int arrayIndex3 = block8 ;
{
{final Integer number = array3 [ arrayIndex3 ] ;{
{
				result3[number] = com . valtech . foobarqix . engine . FooBarQixEngine .computeSimple(number+1);
			}
		}
}}
}
}
}
}
;
branches3 .add (branch5 );
}
}
}
}
final apx . lang . gen . ExitStatus exitStatus3 =parallelBlock3 . run (branches3 );
if(exitStatus3 .hasReturned ()) {
throw new apx . lang . gen . ReturnException (exitStatus3 .<String [ ] >returnedValue ());
} {
final Throwable throwable3 =exitStatus3 .thrownException ();
if(throwable3 !=null) {
if(throwable3 instanceof RuntimeException ) throw (RuntimeException )throwable3 ;
if(throwable3 instanceof Error ) throw (Error )throwable3 ;
}
}
} }
}
}
		
		}
}}
}
}
}
}
;
branches4 .add (branch6 );
}
}
}
}
final apx . lang . gen . ExitStatus exitStatus4 =parallelBlock4 . run (branches4 );
if(exitStatus4 .hasReturned ()) {
return exitStatus4 .<String [ ] >returnedValue ();
} {
final Throwable throwable4 =exitStatus4 .thrownException ();
if(throwable4 !=null) {
if(throwable4 instanceof RuntimeException ) throw (RuntimeException )throwable4 ;
if(throwable4 instanceof Error ) throw (Error )throwable4 ;
}
}
} }
}
return result;
	}
	
	public static String[] computeSimple(Integer[] numbers) {
		String[] result = new String[numbers.length];
		
		for ( Integer i : numbers) {
{
			for ( Integer number : numbers) {
{
				result[number] = computeSimple(number+1);
			}
		}
}
		
		}
return result;
	}
	
	public static String computeSimple(int value) {
		String s = "";
		
		if((value % 3) == 0) {
			s += "Foo";
		}
		
		if((value % 5) == 0) {
			s += "Bar";
		}
		
		if((value % 7) == 0) {
			s += "Qix";
		}
		
		if((value % 10) == 3) {
			s += "Foo";
		}
		
		if((value / 10) == 3) {
			s += "Foo";
		}
		
		if((value % 10) == 5) {
			s += "Bar";
		}
		
		if((value / 10) == 5) {
			s += "Bar";
		}
		
		if((value % 10) == 7) {
			s += "Qix";
		}
		
		if((value / 10) == 7) {
			s += "Qix";
		}
		
		if(s.length() == 0) {
			s = Integer.toString(value);
		}
		
		return s;
	}
}
