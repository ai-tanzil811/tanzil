import socket
port= 5060
data=16
disconnected_msg="End"
format="utf-8"
hostname= socket.gethostname()
host_addr= socket.gethostbyname(hostname)
server_socket_address= (host_addr, port)
server= socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(server_socket_address)
server.listen()
print("Server is listening")

def count_vowels(message):
    vowels = ['a', 'e', 'i', 'o', 'u'] 
    count = 0
    for ch in message:
        if ch.lower() in vowels:
            count += 1

    if count == 0:
        return "Not enough vowels"
    elif count <= 2:
        return "Enough vowels I guess"
    else:
        return "Too many vowels"

while True:
    
    conn,addr= server.accept()
    print("Connected to: ", addr)
    connected= True

    while connected:
        
        
        initial = conn.recv(data).decode(format)
        print("Length of the message to be sent", initial)
        if initial:
            meg_length= int(initial)
            msg= conn.recv(meg_length).decode(format)
            if msg==disconnected_msg:
                print("Terminating connection with", addr )
                conn.send("ALLAH HAFEZ".encode(format))
                connected=False
            else:
                print(f"Message received: {msg}")
                response = count_vowels(msg)
                print(f"Vowel response: {response}")
                conn.send(response.encode(format))

    conn.close()

             