# Operating System Book ppt : https://www.os-book.com/OS9/slide-dir/index.html

Day 1: Operating System

Date: 20-09-2022
---------------------------------------------------

Topics:

	-Introduction to Operating System
  	-Introduction to Linux
	
	Operating system:
  	OS : CLI (Linux), GUI ( Windows)
	
	
	UNIX :stability
	------
      -1969
      -AT&T Bell Lab, Ken Thompson & Dennis Ritche
      -CLI      
      -copywrites     
      -Complete OS      
      -servers, workstations and mainframes
      
      -Not portable
      
      -Administrator
      
      -Folder
      
      -\
      
      -Insecure
      
      -H/w cost more
	
	Linux
	-------
      -1991      
      -freely available,open source      
      -Kernel      
      -user & developer      
      -Portable      
      -Root User      
      -Directory      
      -/      
      -Secure         
      -H/w cost low      
      -Linus Torvalds      
      -32/64 bit      
      -compiler : C, C++, Fortran,JVM      
      -Tools: sed, awk, grep....      
      -Newtwork:putty, telnet, ftp, ping,...      
      -GUI      
      -Multitasking, Multiprogramming, Multiuser      
      -multiple platforms      
      -Distro
            -Ubuntu
            -mint
            -Fedora
            -RedHat
            -CentOS
	    
	Architecture:
  		-Hardware    
		-Kernel    
		-System call interface    
		-Application/Commands
	
	Shell:
	-It is a program that lies on the interface between users and kernel.  
	-CLI: Command Line Interpreter.  
	-Types:
      -Bourne shell(.sh)
      -C shell(.sh)
      -Korn shell(.ksh)
      -Bourne Again Shell (bash)(.sh)

	File system:
    -Top directory: 'root (/)'
    -username & password
    -unique name
    -case sensetive (Shell, shell)
    -C, C++, Fortran, Pascal, Java, cobol,

    -Shell programming 
	
<hr>
# Day 12: Operating System

Date: 21-09-2022
---------------------------------------------------

Topics:
	-Process Management
	-Linux	Commands
	
Process:
---------

	-instance of computer program
	-shorter lifespan	
	-h/w directly invovled	
	-dynamic instance for code & data	
	-running instance

Program:
---------
	-collection of instruction	
	-longer timespan	
	-h/w not directly invovled	
	-static code & data	
	-execute code


Process concept:
----------------
	-Batch system -jobs	
	-Time shared systems-time slice (quantum)
	
	-Execution:
	
		-program counter		
		-stack		
		-data section
	

Process states: Life cycle of Process
--------------------------------------


Process Control Block:
-----------------------

Process Scheduling:
--------------------
	-process which is in ready state	
	-process will move from ready to running state(allocating CPU)	
	-Aim : to keep CPU busy to get maximum CPU utilization.	
	-to deliver minimum response time

Scheduling:
-----------
	1.Non-preemptive Scheduling	
	
	2.Preemptive Scheduling	
		-some priority will be given for CPU allocation		
		-based on criteria:		
			-shortest			
			-First			
			-time slice=5min			
			-longest

	
Linux Commands:
---------------	
	man : to take help	
	man ls:
	
	ls:To list the files
	
		-a		
		-l		
		-d		
		-c		
		-S		
		-h

	cd : change directory
	
		cd dir_name		
		cd ~		
		cd ..
		cd ../ ../		
		cd - 

	pwd:working directory

	cp : copy the content of file	
		-cp -i(iteractive)		
		-cp -r <source> <destination>
	mkdir

	rm
	rm -rf
	mv <old> <new>	
	rm filename	
	rm file1 file2 file3	
	rm -i

	cat file1 	
	cat > file	
	cat >> file

	head [-n] file	
	head -2 x2.txt
	tail -2 x2.txt

	grep

	sort file	
	sort -r file	
	sort -ru file

	Regular Expressions:
	----------------------

		. 	character
		[]	match any character listed in the brackets		
		[^ ]	match any character not listed in the brackets		
		^	matches in the begining of the line		
		$	matches in the end of the line		
		*	match with anything

	man	
	-h	
	-help
	

	Users & Permissions:
	--------------------
	3 types access writes
	
		-Read : r		
		-Write : w		
		-Execute :x

	3 types of levels
	
		-User : u : owner		
		-Group : g : each file accessable to given list of users		
		-Others : o : other user

<hr>

Day 14: Operating System

Date: 23-09-2022
---------------------------------------------------

	Topics:
		-Shell programming
	
	#!/bin/sh
	or
	#!/bin/bash

	Example:

	#!/bin/bash
	pwd

shell parameter:
------------------

	$1 - $9 : positional parameter
	${10}-${n} : positional parameter can be used as an arguments
	$0 : name of scripting
	$* : all the arguments 
	$@ : (")
	$# : PID of scriptin
	$? : return code


	code: 
	echo "File name: $0"
	echo "File name: $1"
	echo "File name: $2"
	echo "File name: $@"
	echo "File name: $*"
	echo "File name: $#"

	code: 
	#!/bin/bash
	x=2
	y=3
	res=`expr $x*$y`
	echo res

Operators:
-----------
-Arithmetic operator

	-+,-,*,/,%,++,--
	
	code:
	#!/bin/bash
	x=20
	y=10

	((sum=$x+$y))
	echo $sum

	((sub=$x-$y))
	echo "Result= $sub"

	((mul=$x*$y))
	echo "Result= $mul"

	((x++))
	echo "Result= $x"

	((++x))
	echo "Result= $x"

	((y--))
	echo "Result= $y"

	((--y))
	echo "Result= $y"
	
-Relational operator

	>,<,==,!=,>=,<=
	
	-eq : [ $a -eq $b ] is not true
	-ne
	-gt
	-lt
	-ge
	-le

code:

	#!/bin/bash
	x=20
	y=10

	syntax:
	Ex1 :
	if[(( $x==$y ))] then
			echo "same"

	fi

	Ex2 :
	if(( $x==$y )) then
		echo "same"
	else
		echo "different"
	fi

	if(( $x>=$y ))
		echo "same"
	else
		echo "different"
	fi


	if [[ ( $n -gt 10 ) && ( $n%2 -eq 0 ) ]];
	
	((sum=$x+$y))
	echo $sum

	-Logical operator
	
		&&, ||, !

	if(( ![expr `$x==$y`]] ||[ $x=="true" ))
		echo "same"
	else
		echo "different"
	fi


	-Bitwise operator
		-&:bitwise And,
		-|:bitwise Or,
		-^:XOR,
		-~:complement,
		-<<:Left shift,
		->>:Right shift

	code:
	#!/bin/bash
	read   a
	read   b

	echo $(( a&b ))
	or
	bita=$(( a&b ))
	echo $bita

	echo $(( a|b ))

	echo $(( a^b ))

	echo $(( ~a ))
	echo $(( ~b ))

	echo $(( a<<2 ))

	echo $(( a>>1 ))

	conditional statements:
	-----------------------

	-if stmt
	-if-else stmt
	-if-else stmt (If-else ladder)
	-if-else stmt (If-else nesting)
	-switch stmt

	case 1:

	if [ expression ] then
		stmt
	fi
	-----------------------
	case 2:

	if [ expression ] then
		stmt
	else
		stmt
	fi

	-----------------------
	case 3:

	if [ $((sum=$a+$b)) > ] then
		stmt
	elif [ expression 2 ] then
		stmt
	elif [ expression 3 ] then
		stmt
		....
		....
	else
		stmt
	fi

	-----------------------
	case 4:

	if [ expression ] then
		stmt
	else
		if [ expression ] then
			if [ expression ] then
				stmt
			else
				stmt
			fi
		else
			stmt
		fi
	fi

	-----------------------
	case 5:

	case in
		p1) stm1;;
		p2) stm1;;
		p3) stm1;;
		p4) stm1;;
		p5) stm1;;

	esac

	-----------------------
	Loops
		1.while
		2.for
		3.until 

		break
		continue
	case 5:


	for Loop:
	---------
	for a in 4 5 6 7 8 
	do
		if [ $a -eq 7];
		then
			break;
		echo "$a counter"

	done

	for Loop:
	---------
	for a in {0..50}
	do
		if [ $a -eq 7];
		then
			continue;
		echo "$a counter"

	done
	for Loop:
	---------
	for a in 4 5 6 7 8 
	do
		if [ $a -eq 7];
		then
			continue;
		echo "$a counter"

	done

	while Loop:
	------------
	a=1
	while [ $a -lt 10]
	do
		echo $a
		a= `expr $a + 1`
	done



	Until Loop:
	--------------
	read n //500
	n=100;
	until [ $n -gt 5 ]
	do	
		echo $n
		n= `expr $n + 1`
		if [ $a -eq 7];
		then
			continue;
	done


	Function:
	------------
	Hello() {
		echo "Hello "
	}

	Hello


	Hello() {
		echo "Hello $1"
	}

	Hello

Hoemwork :

	Q1. Lucky draw: 
	input : 15 tp 45: Win otherwise lost.

	Q2 number: identify biggest number
	 read input user for 3 values and print big number.

<hr>

Day 15: Operating System
Date: 24-09-2022
---------------------------------------------------

Topics:
	-Thread
	-Deadlock

Thread:
--------
	-Multiprocessor system, Multicore
		-distribution of activities
		-Balance
		-data splitting
		-Data dependency
		-Testing
	-Parallel
	-concurrency support


Process: heaveyweight process
Thread: lightweigt processs


Thread: A thread is a basic unit of CPU utilization.

Types of thread:
-----------------
	1. User thread
		-Java threads
		-POSIX threads
		-Windows threads

	2. Kernel thread
		-Windows
		-Linux
		-Mac os
		-Solaris
	Amdahl's Law:


Thread Mapping:
---------------
	Many to one
	One to One
	Many to Many

Deadlock:
---------
	-CPU 
	-MemoryCache
	-devices
	-RAM


	-Request a resource
	-USe the resources
	-Release the resources

	-file, db, i/o, lib, h/w etc,


	Notepad++,sql, mongodb, hibernate, springboot, react, node, .NET
	4GM RAM ---> 8GM

	-Deadlock is a situations  where a set of processes 
	are blocked because each process is holding a resource and 
	waiting for another resource acquired by some other process.

	-Request a resource
	-USe the resources
	-Release the resources

	Deadlock characterization:
	--------------------------
	1.Mutual exclusion
	2.Hold and Wait
	3.No preemption
	4.circular wait

	Solution to deadlock :
	1. Deadlock Prevention & avoidance
	2. Deadlock detection and recovery
	3. Ignore the problem

	Deadlock Handling
	--------------------
	1. Pre-emption
	2. Roll back
	3. Kill the process

	Graph allocation method: 
	-------------------------

	Bankers Algorithm:Deadlock avaoidance
	-------------------------------------------
	1. no of process to be excute, resource available
	2. duration for resources
	3. available resources

	Deadlock prevention strategies:
	-----------------------------------
	-Mutual exclusion
	-hold & wait

Homework :

	Q1. Differentiate between process & threads.
	
	Q2 .Differentiate between user thread & kernel thread.

<hr> 

# Interview Questions 

    1.Why is the operating system important?
    
    2.What's the main purpose of an OS? What are the different types of OS?
    
    3.What are the benefits of a multiprocessor system?
    
    4.What is RAID structure in OS? What are the different levels of RAID configuration?
    
    5.What is GUI?
    
    6.What is a Pipe and when it is used?
    
    7.What are the different kinds of operations that are possible on semaphore?
    
    8.What is a bootstrap program in OS?
    
    9.Explain demand paging?
    
    10.What do you mean by RTOS?
    
    11.What do you mean by process synchronization?
    
    12.What is IPC? What are the different IPC mechanisms?
    
    13.What is different between main memory and secondary memory.
    
    14.What do you mean by overlays in OS?
    
    15.Write top 10 examples of OS?
    
    16.What is virtual memory?
    
    17.What is thread in OS?
    
    18.What is a process? What are the different states of a process?
    
    19.What do you mean by FCFS?
    
    20.What is Reentrancy?
    
    21.What is a Scheduling Algorithm? Name different types of scheduling algorithms.
    
    22.What is the difference between paging and segmentation?
    
    23.What is thrashing in OS?
    
    24.What is the main objective of multiprogramming?
    
    25.What do you mean by asymmetric clustering?
    
    26.What is the difference between multitasking and multiprocessing OS?
    
    27.What do you mean by Sockets in OS?
    
    28.Explain zombie process?
    
    29.What do you mean by cascading termination?
    
    30.What is starvation and aging in OS?
