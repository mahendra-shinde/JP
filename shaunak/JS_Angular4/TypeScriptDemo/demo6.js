function disp_details(id, name, mail_id) {
    console.log("ID is : " + id);
    console.log("Name is : " + name);
    if (mail_id != undefined)
        console.log("Email ID : " + mail_id);
}
disp_details(123, "Shaunak");
console.log("******************");
disp_details(123, "Viral", "viral@jp.com");
