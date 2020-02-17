import { Component, OnInit, ViewChild } from "@angular/core";
import { UserRegistration } from "./userregistation";
import { UserRegistrationService } from "./userregistration.service";
import { MatPaginator } from "@angular/material/paginator";
import { MatTableDataSource } from "@angular/material/table";

@Component({
  selector: "self-registration",
  templateUrl: "./userregistration.component.html",
  styleUrls: ["./userregistration.component.css"]
})
export class UserRegistrationComponent implements OnInit {
  Roles: any = ["Applicant", "Reviewer"];
  displayedColumns: string[] = [
    "First Name",
    "Last Name",
    "Email",
    "Phone Number",
    "Company Name",
    "User Role"
  ];
  page = 1;
  pageSize = 10;
  profiles = [];
  userRegistration = new UserRegistration();

  dataSource = new MatTableDataSource(this.profiles);

  @ViewChild(MatPaginator, { static: true }) paginator: MatPaginator;

  constructor(private userRegistrationService: UserRegistrationService) {}

  ngOnInit(): void {
    this.getAllProfiles();
  }

  getAllProfiles(): void {
    this.userRegistrationService.getAllProfiles().subscribe((data: any[]) => {
      this.profiles = data;
      this.dataSource = new MatTableDataSource(this.profiles);
      this.dataSource.paginator = this.paginator;
    });
  }

  selfRegistration(): void {
    this.userRegistrationService
      .selfRegistration(this.userRegistration)
      .subscribe(
        response => {
          console.log(response);
          this.reset();
          this.getAllProfiles();
        },
        error => {
          console.log(error);
        }
      );
  }

  private reset() {
    this.userRegistration.firstNm = null;
    this.userRegistration.lastNm = null;
    this.userRegistration.email = null;
    this.userRegistration.phoneNr = null;
    this.userRegistration.establishmentNm = null;
    this.userRegistration.userRole = null;
  }
}
