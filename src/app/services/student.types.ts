export interface Student {
    id: number;
    firstName: string;
    lastName: string;
    email: string;
    phone: string;
    classId: number;
    rollNumber: number;
}

export interface Attendance {
    studentId: number;
    a_date: string;
    status: string;
    remarks?: string;
}

export interface StudentWithAttendance {
    studentId: number;
    firstName: string;
    lastName: string;
    rollNumber: string;
    date: string;
    status: string;
}