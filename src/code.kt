fun main(args: Array<String> ){
    val daysInMonth : Array<Int>
    val year : Int
    val date : Int
    var month : Int =0
    var totalDays =0
    daysInMonth = arrayOf(31,28,31,30,31,30,31,31,30,31,30,31)
    year = readLine()!!.toInt()
    if(leap(year)&&year!=1918){
        daysInMonth[1] = 29
    }
    if(year == 1918){
        daysInMonth[1] = 15
    }
    for(i in daysInMonth.indices){
        if(totalDays<256){
        totalDays += daysInMonth[i]
        month =i
            }
        else {
            totalDays = totalDays - daysInMonth[i-1]
            break}
    }
    date = 256 - totalDays
    println(String.format("%02d",date)+"."+String.format("%02d",month+1)+".$year")

}
fun leap(year:Int):Boolean{
    if((year%4) == 0){
        if(year < 1918)
            return true
        else if((year%100) ==0){
            if((year%400) ==0)
                return true
            else return false
        }
        return true;
    }
    return false
}