var num:number=0;
var count:number=0;
for(num=0;num<=20;num++)
{
    if (num % 2==0)
    {
        continue;
    }
    count++
}
console.log("The Count of Odd Values berween 0 and 20 is: "+count);