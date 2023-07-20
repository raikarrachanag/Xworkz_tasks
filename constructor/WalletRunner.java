class WalletRunner{

 public static void main(String[] args)
 {
  Wallet wallet=new Wallet();
  System.out.println("Invoking brand in WalletRunner: " +wallet.brand);
  System.out.println("Invoking material in WalletRunner: " +wallet.material);
  System.out.println("Invoking price in WalletRunner: " +wallet.price);
  
  System.out.println("===============================================================");
  
  Wallet wallet1=new Wallet("puma", "leather", 2999);
  System.out.println("Invoking brand in WalletRunner: " +wallet1.brand);
  System.out.println("Invoking material in WalletRunner: " +wallet1.material);
  System.out.println("Invoking price in WalletRunner: " +wallet1.price);
  
  }}