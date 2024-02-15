function comment()
{
    let a = document.getElementById("xx"), b = document.getElementById("firstNumber").value, c = document.getElementById("secondNumber").value;

    // Check if the first and second is a number
    if(isNaN(b) && isNaN(c)) return 0;
    var val1 = parseInt(b);
    var val2 = parseInt(c);

    let sum = val1+val2;

    alert("sum result: "+sum);
}