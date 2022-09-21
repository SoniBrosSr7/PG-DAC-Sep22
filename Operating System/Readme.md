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
		
		[^ ]match any character not listed in the brackets
		
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
