import { Component, OnInit } from '@angular/core';

import { AccountService } from '../account.service';
import { Account } from '../account';


@Component({
  selector: 'app-addaccount',
  templateUrl: './addaccount.component.html',
  styleUrls: ['./addaccount.component.css']
})
export class AddaccountComponent implements OnInit {

  account: Account = new Account();
  msg:string;
  errorMsg:string;
  constructor(private accountService:AccountService) { }

  ngOnInit() {
  }

  addAccount(){
    this.accountService.addAccount(this.account).subscribe((data)=>{
      console.log("data",data);
      this.msg=data; this.errorMsg=undefined;this.account=new Account()},
      error=>{this.errorMsg = JSON.parse(error.error).message;
       console.log(error.error);this.msg=undefined});
  }
}
