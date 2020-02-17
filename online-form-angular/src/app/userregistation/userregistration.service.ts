import {
  HttpClient,
  HttpErrorResponse,
  HttpHeaders
} from "@angular/common/http";
import { Injectable } from "@angular/core";
import { UserRegistration } from "./userregistation";
import { throwError } from "rxjs";
import { retry, catchError } from "rxjs/operators";

@Injectable({
  providedIn: "root"
})
export class UserRegistrationService {
  constructor(private httpClient: HttpClient) {}

  private getProfiles_url =
    "http://localhost:8080/v1/rest/auth/findAllProfiles";

  private postSelfRegUrl =
    "http://localhost:8080/v1/rest/auth/userregistration";

  handleError(error: HttpErrorResponse) {
    let errorMessage = "Unknown error!";
    if (error.error instanceof ErrorEvent) {
      // Client-side errors
      errorMessage = `Error: ${error.error.message}`;
    } else {
      // Server-side errors
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    window.alert(errorMessage);
    return throwError(errorMessage);
  }

  public getAllProfiles() {
    return this.httpClient.get(this.getProfiles_url).pipe(
      retry(3),
      catchError(this.handleError)
    );
  }

  public selfRegistration(userRegistration: UserRegistration) {
    let body = JSON.stringify(userRegistration);
    const httpOptions = {
      headers: new HttpHeaders({
        "Content-Type": "application/json",
        "Access-Control-Allow-Origin": "*"
      })
    };

    return this.httpClient
      .post(this.postSelfRegUrl, body, httpOptions)
      .pipe(catchError(this.handleError));
  }
}
