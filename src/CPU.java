public class CPU {

    public short PC;
    public byte  SP;

    public short[] stack;

    public short  I;
    public byte[] memory;
    public byte[] registers;

    public byte[] frameBuffer;

    public CPU() {

        this.PC = 0x200;
        this.SP = 0x0;

        this.stack = new short[16];

        this.I         = 0x0000;
        this.memory    = new byte[4094];
        this.registers = new byte[16];

        this.frameBuffer = new byte[64 * 32];

    }

}
