function show()
{
    var name = document.getElementById("name").value;
    var email = document.getElementById("email").value;
    var number = document.getElementById("number").value;
    var country = document.getElementById("country").value;


    if (name=="" || name==null)
    {
        document.getElementById("msg1").innerText = "Please enter your name";
    }
    if (email=="" || email==null)
    {
        document.getElementById("msg2").innerText = "Please enter your email";
    }
    if (number=="" || number==null)
    {
        document.getElementById("msg3").innerText = "Please enter your number";
    }
    if (country == " ")
    {
        document.getElementById("msg4").innerText = "Please select your country";
    }
    
}

function ischecked()
{   
    var genm = document.getElementById("male").checked;
    var genf = document.getElementById("female").checked;

    if (genm == false && genf == false)
    {
        document.getElementById("msg5").innerText = "Please select your gender";
        return false;
    }
    else
    {
        return true;
    }

}
