import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Transfer } from './transfer';
import { Account } from './account';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  constructor(private http:HttpClient) { }

  public viewAll():Observable<any>{
   return this.http.get("http://localhost:8082/springrest/viewall");
  }

  public addAccount(account:Account):Observable<any>{
    return this.http.post("http://localhost:8082/springrest/add",account,{responseType:'text'});
  }
  public transferAccount(transfer:Transfer):Observable<any>{
    return this.http.post("http://localhost:8082/springrest/transfer",transfer,{responseType:'text'});
  }
}
