import { Component, OnInit } from '@angular/core';
import { SalesPerson } from './sales-person';

@Component({
  selector: 'app-sales-person-list',
  templateUrl: './sales-person-list.component.html',
  styleUrls: ['./sales-person-list.component.css'],
})
export class SalesPersonListComponent implements OnInit {
  SalesPersonList: SalesPerson[] = [
    new SalesPerson('Rahul', 'teja', 'RahulTeja@gmail.com', 20000),
    new SalesPerson('Asit', 'Raj', 'AsitRaj@gmail.com', 22200),
    new SalesPerson('Nithin', 'Chandra', 'NithinChandra@gmail.com', 30010),
    new SalesPerson('Guru', 'Raj', 'GuruRaj@gmail.com', 55000),
    new SalesPerson('Mahesh', 'Bhuvi', 'MaheshBhuvi@gmail.com', 57000),
    new SalesPerson('Angeline', 'Ester', 'AngelineEster@gmail.com', 29999),
    new SalesPerson('Ashish', 'Sharma', 'AshishSharma@gmail.com', 40300),
  ];
  constructor() {}
  ngOnInit() {}
}
