JavaEE6中提供了基于java Annotation(注解)的Bean校验框架
在工作中特别对于task任务处理常常需要对参数进行校验，为了方便和重用，自己写了一个简单的基于Annotation的校验框架。有兴趣的可以扩展。
 
框架说明：
IwAnnotation接口：所有需要使用该校验框架的类都要实现它，该类中没有任何方法需要实现，仅仅是一个表明那些类需要使用该校验框架的标识。
GetFiledValue类：是一个工具类，对外提供一个静态方法public static Object getFieldValue(IwAnnotation targetObj, String fieldName)用于获得指定类对象的指定属性值。
Handler接口：是所有校验处理的接口。
ValidatorException类：是校验框架中任何异常均被封装成该异常对象向上抛出。
 
该校验框架所提供的校验注解有：
@NotEmpty:校验对象的字段不能为空,如果是集合则集合的size为0
@RegEx:针对字符串的高级校验，可以指定字符串的正则表达式。
@IntType:针对数字进行交验,可以指定数字的一个大小范围
所有以上的注解都有一个message属性用于指定校验出差时异常信息内容，都有默认值，可以指定也可以不用指定。
这些注解里面的一些其他参数用法请参考测试用例。
 
以上所有的注解都有一个对应的Handler用于处理该注解，这些handler都实现Handler接口。
这些Handler具体负责每个对应的注解的校验，如果校验失败则抛出ValidateException异常。
 
校验框架最核心的是Xvalidator，这个类是一个单态模式，使用时只需要调用其public void validate(IwAnnotation iwAnnotation)方法，把需要校验的实现了IwAnnotation接口的对象当作参数传进去就可以了。
Validator的工作原理是：
1.获得校验对象后，扫描该对象中是否存在自定义的校验注解，存在就去调用相应的注解处理类（对应的handler）进行校验。
2.校验对象校验结束后，递归校验其父类，直到IwAnnotation接口为止。
 
优点：
1.使用方便，重用性高。
2.可以根据需求进行定制化开发。
3.适合后台的数据校验。
 
不足：
1.功能有限,交验规则写死在程序中.

 
有兴趣的可以进行扩展。