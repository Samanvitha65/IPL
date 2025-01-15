
export class TicketBooking {
    bookingId: number;
    email: string;
    matchId: number;
    numberOfTicketes: number;
   
    constructor(
      bookingId: number,
      email: string,
      matchId: number,
      numberOfTicketes: number,
    ){
      this.bookingId=bookingId;
      this.email=email;
      this.matchId=matchId;
      this.numberOfTicketes=numberOfTicketes;
    }
    displayInfo(){
      console.log(`Booking ID: ${this.bookingId}`);
      console.log(`Email: ${this.email}`);
      console.log(`Number of tickets: ${this.numberOfTicketes}`);
    }
  }