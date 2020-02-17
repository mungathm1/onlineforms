import { Component, OnInit } from "@angular/core";
import { LoginModule } from "./login";

@Component({
  selector: "login-screen",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"]
})
export class LoginComponent implements OnInit {
  loginModule = new LoginModule();

  ngOnInit(): void {
    throw new Error("Method not implemented.");
  }
}
