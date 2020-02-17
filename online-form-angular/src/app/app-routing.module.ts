import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { UserRegistrationComponent } from "./userregistation/userregistration.component";
import { LoginComponent } from "./login/login.component";

const routes: Routes = [
  { path: "", pathMatch: "full", redirectTo: "login" },
  { path: "login", component: LoginComponent },
  { path: "selfregister", component: UserRegistrationComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
